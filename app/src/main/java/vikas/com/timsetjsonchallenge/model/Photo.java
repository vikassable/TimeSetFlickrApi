package vikas.com.timsetjsonchallenge.model;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo implements Serializable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("secret")
    @Expose
    private String secret;
    @SerializedName("server")
    @Expose
    private String server;
    @SerializedName("farm")
    @Expose
    private Long farm;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("ispublic")
    @Expose
    private Long ispublic;
    @SerializedName("isfriend")
    @Expose
    private Long isfriend;
    @SerializedName("isfamily")
    @Expose
    private Long isfamily;
    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("dateupload")
    @Expose
    private String dateupload;
    @SerializedName("ownername")
    @Expose
    private String ownername;
    @SerializedName("originalsecret")
    @Expose
    private String originalsecret;
    @SerializedName("originalformat")
    @Expose
    private String originalformat;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("accuracy")
    @Expose
    private String accuracy;
    @SerializedName("context")
    @Expose
    private Long context;
    @SerializedName("place_id")
    @Expose
    private String placeId;
    @SerializedName("woeid")
    @Expose
    private String woeid;
    @SerializedName("geo_is_family")
    @Expose
    private Long geoIsFamily;
    @SerializedName("geo_is_friend")
    @Expose
    private Long geoIsFriend;
    @SerializedName("geo_is_contact")
    @Expose
    private Long geoIsContact;
    @SerializedName("geo_is_public")
    @Expose
    private Long geoIsPublic;
    private final static long serialVersionUID = -4783630692766579295L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public Long getFarm() {
        return farm;
    }

    public void setFarm(Long farm) {
        this.farm = farm;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getIspublic() {
        return ispublic;
    }

    public void setIspublic(Long ispublic) {
        this.ispublic = ispublic;
    }

    public Long getIsfriend() {
        return isfriend;
    }

    public void setIsfriend(Long isfriend) {
        this.isfriend = isfriend;
    }

    public Long getIsfamily() {
        return isfamily;
    }

    public void setIsfamily(Long isfamily) {
        this.isfamily = isfamily;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public String getDateupload() {
        return dateupload;
    }

    public void setDateupload(String dateupload) {
        this.dateupload = dateupload;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getOriginalsecret() {
        return originalsecret;
    }

    public void setOriginalsecret(String originalsecret) {
        this.originalsecret = originalsecret;
    }

    public String getOriginalformat() {
        return originalformat;
    }

    public void setOriginalformat(String originalformat) {
        this.originalformat = originalformat;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public Long getContext() {
        return context;
    }

    public void setContext(Long context) {
        this.context = context;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getWoeid() {
        return woeid;
    }

    public void setWoeid(String woeid) {
        this.woeid = woeid;
    }

    public Long getGeoIsFamily() {
        return geoIsFamily;
    }

    public void setGeoIsFamily(Long geoIsFamily) {
        this.geoIsFamily = geoIsFamily;
    }

    public Long getGeoIsFriend() {
        return geoIsFriend;
    }

    public void setGeoIsFriend(Long geoIsFriend) {
        this.geoIsFriend = geoIsFriend;
    }

    public Long getGeoIsContact() {
        return geoIsContact;
    }

    public void setGeoIsContact(Long geoIsContact) {
        this.geoIsContact = geoIsContact;
    }

    public Long getGeoIsPublic() {
        return geoIsPublic;
    }

    public void setGeoIsPublic(Long geoIsPublic) {
        this.geoIsPublic = geoIsPublic;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id='" + id + '\'' +
                ", owner='" + owner + '\'' +
                ", secret='" + secret + '\'' +
                ", server='" + server + '\'' +
                ", farm=" + farm +
                ", title='" + title + '\'' +
                ", ispublic=" + ispublic +
                ", isfriend=" + isfriend +
                ", isfamily=" + isfamily +
                ", description=" + description +
                ", dateupload='" + dateupload + '\'' +
                ", ownername='" + ownername + '\'' +
                ", originalsecret='" + originalsecret + '\'' +
                ", originalformat='" + originalformat + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", accuracy='" + accuracy + '\'' +
                ", context=" + context +
                ", placeId='" + placeId + '\'' +
                ", woeid='" + woeid + '\'' +
                ", geoIsFamily=" + geoIsFamily +
                ", geoIsFriend=" + geoIsFriend +
                ", geoIsContact=" + geoIsContact +
                ", geoIsPublic=" + geoIsPublic +
                '}';
    }
}


