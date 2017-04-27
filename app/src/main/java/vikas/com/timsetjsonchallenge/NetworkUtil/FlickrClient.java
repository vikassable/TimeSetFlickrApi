package vikas.com.timsetjsonchallenge.NetworkUtil;

import retrofit2.Call;
import retrofit2.http.GET;
import vikas.com.timsetjsonchallenge.model.PhotosResponse;

/**
 * Created by Vikas on 4/26/2017.
 */

public interface FlickrClient {
    @GET("/services/rest/?method=flickr.photos.search&license=1,2,4,7&has_geo=1&extras=original_format,description,geo,date_upload,owner_name&format=json&nojsoncallback=1&api_key=ccc0bafafb2e761c02f4b2a5feb5ba88")
    Call<PhotosResponse> getPhotos();
}

