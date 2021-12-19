package android.support.p010v4.media;

import android.media.Rating;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() {
        /* class android.support.p010v4.media.RatingCompat.C01021 */

        static {
            Covode.recordClassIndex(115);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }
    };

    /* renamed from: a */
    public final int f319a;

    /* renamed from: b */
    private final float f320b;

    /* renamed from: c */
    private Object f321c;

    public final int describeContents() {
        return this.f319a;
    }

    static {
        Covode.recordClassIndex(114);
    }

    public final String toString() {
        String valueOf;
        StringBuilder append = new StringBuilder("Rating:style=").append(this.f319a).append(" rating=");
        float f = this.f320b;
        if (f < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f);
        }
        return append.append(valueOf).toString();
    }

    /* renamed from: a */
    public static RatingCompat m188a(Object obj) {
        float f;
        RatingCompat ratingCompat = null;
        if (obj != null) {
            int i = Build.VERSION.SDK_INT;
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        ratingCompat = new RatingCompat(ratingStyle, -1.0f);
                        break;
                }
            } else {
                float f2 = 1.0f;
                switch (ratingStyle) {
                    case 1:
                        if (!rating.hasHeart()) {
                            f2 = 0.0f;
                        }
                        ratingCompat = new RatingCompat(1, f2);
                        break;
                    case 2:
                        if (!rating.isThumbUp()) {
                            f2 = 0.0f;
                        }
                        ratingCompat = new RatingCompat(2, f2);
                        break;
                    case 3:
                    case 4:
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        float starRating = rating.getStarRating();
                        if (ratingStyle == 3) {
                            f = 3.0f;
                        } else if (ratingStyle == 4) {
                            f = 4.0f;
                        } else if (ratingStyle == 5) {
                            f = 5.0f;
                        }
                        if (starRating >= 0.0f && starRating <= f) {
                            ratingCompat = new RatingCompat(ratingStyle, starRating);
                            break;
                        }
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        float percentRating = rating.getPercentRating();
                        if (percentRating >= 0.0f && percentRating <= 100.0f) {
                            ratingCompat = new RatingCompat(6, percentRating);
                            break;
                        }
                    default:
                        return null;
                }
            }
            ratingCompat.f321c = obj;
        }
        return ratingCompat;
    }

    RatingCompat(int i, float f) {
        this.f319a = i;
        this.f320b = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f319a);
        parcel.writeFloat(this.f320b);
    }
}
