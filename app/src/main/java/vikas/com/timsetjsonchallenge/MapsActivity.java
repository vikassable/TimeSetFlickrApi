package vikas.com.timsetjsonchallenge;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import vikas.com.timsetjsonchallenge.NetworkUtil.FlickrClient;
import vikas.com.timsetjsonchallenge.NetworkUtil.ServiceGenerator;
import vikas.com.timsetjsonchallenge.model.Photo;
import vikas.com.timsetjsonchallenge.model.PhotosResponse;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private static String TAG = MapsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                Photo photo = (Photo) marker.getTag();
                Log.d(TAG, photo.toString());
                Toast.makeText(MapsActivity.this, photo.getTitle(), Toast.LENGTH_SHORT).show();
                return false;

            }
        });

        FlickrClient flickrClient = ServiceGenerator.createService(FlickrClient.class);
        Call<PhotosResponse> call = flickrClient.getPhotos();
        call.enqueue(new Callback<PhotosResponse>() {
            @Override
            public void onResponse(Call<PhotosResponse> call, Response<PhotosResponse> response) {
                Log.d(TAG, response.body() + "");
                PhotosResponse photosResponse = response.body();
                Log.d(TAG, "photos : " + photosResponse.getPhotos().getPhoto().size());
                for (Photo photo : photosResponse.getPhotos().getPhoto()) {
                    LatLng markerLatLang = new LatLng(Float.parseFloat(photo.getLatitude()), Float.parseFloat(photo.getLongitude()));
                    Marker marker = mMap.addMarker(new MarkerOptions().position(markerLatLang).title(photo.getOwnername()));
                    marker.setTag(photo);
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(markerLatLang));
                }

            }

            @Override
            public void onFailure(Call<PhotosResponse> call, Throwable t) {
                Log.d(TAG, "request failed");
            }
        });
        
    }
}
