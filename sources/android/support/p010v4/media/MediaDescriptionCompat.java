package android.support.p010v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p010v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() {
        /* class android.support.p010v4.media.MediaDescriptionCompat.C00981 */

        static {
            Covode.recordClassIndex(109);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.m180a(MediaDescription.CREATOR.createFromParcel(parcel));
        }
    };

    /* renamed from: a */
    public final String f295a;

    /* renamed from: b */
    public final CharSequence f296b;

    /* renamed from: c */
    public final CharSequence f297c;

    /* renamed from: d */
    public final CharSequence f298d;

    /* renamed from: e */
    public final Bitmap f299e;

    /* renamed from: f */
    public final Uri f300f;

    /* renamed from: g */
    public final Bundle f301g;

    /* renamed from: h */
    public final Uri f302h;

    /* renamed from: i */
    private Object f303i;

    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(108);
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public static final class C0099a {

        /* renamed from: a */
        String f304a;

        /* renamed from: b */
        CharSequence f305b;

        /* renamed from: c */
        CharSequence f306c;

        /* renamed from: d */
        CharSequence f307d;

        /* renamed from: e */
        Bitmap f308e;

        /* renamed from: f */
        Uri f309f;

        /* renamed from: g */
        Bundle f310g;

        /* renamed from: h */
        Uri f311h;

        static {
            Covode.recordClassIndex(110);
        }

        /* renamed from: a */
        public final MediaDescriptionCompat mo110a() {
            return new MediaDescriptionCompat(this.f304a, this.f305b, this.f306c, this.f307d, this.f308e, this.f309f, this.f310g, this.f311h);
        }
    }

    public final String toString() {
        return ((Object) this.f296b) + ", " + ((Object) this.f297c) + ", " + ((Object) this.f298d);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f295a = parcel.readString();
        this.f296b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f297c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f298d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = getClass().getClassLoader();
        this.f299e = (Bitmap) parcel.readParcelable(classLoader);
        this.f300f = (Uri) parcel.readParcelable(classLoader);
        this.f301g = parcel.readBundle(classLoader);
        this.f302h = (Uri) parcel.readParcelable(classLoader);
    }

    /* renamed from: a */
    public static MediaDescriptionCompat m180a(Object obj) {
        Uri uri;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        C0099a aVar = new C0099a();
        MediaDescription mediaDescription = (MediaDescription) obj;
        aVar.f304a = mediaDescription.getMediaId();
        aVar.f305b = mediaDescription.getTitle();
        aVar.f306c = mediaDescription.getSubtitle();
        aVar.f307d = mediaDescription.getDescription();
        aVar.f308e = mediaDescription.getIconBitmap();
        aVar.f309f = mediaDescription.getIconUri();
        Bundle extras = mediaDescription.getExtras();
        if (extras != null) {
            MediaSessionCompat.m227a(extras);
            uri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
            if (uri != null) {
                if (!extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || extras.size() != 2) {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
            }
            bundle = extras;
        } else {
            uri = null;
            bundle = extras;
        }
        aVar.f310g = bundle;
        if (uri != null) {
            aVar.f311h = uri;
        } else if (Build.VERSION.SDK_INT >= 23) {
            aVar.f311h = mediaDescription.getMediaUri();
        }
        MediaDescriptionCompat a = aVar.mo110a();
        a.f303i = obj;
        return a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Object obj;
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f295a);
            TextUtils.writeToParcel(this.f296b, parcel, i);
            TextUtils.writeToParcel(this.f297c, parcel, i);
            TextUtils.writeToParcel(this.f298d, parcel, i);
            parcel.writeParcelable(this.f299e, i);
            parcel.writeParcelable(this.f300f, i);
            parcel.writeBundle(this.f301g);
            parcel.writeParcelable(this.f302h, i);
            return;
        }
        if (this.f303i != null || Build.VERSION.SDK_INT < 21) {
            obj = this.f303i;
        } else {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f295a);
            builder.setTitle(this.f296b);
            builder.setSubtitle(this.f297c);
            builder.setDescription(this.f298d);
            builder.setIconBitmap(this.f299e);
            builder.setIconUri(this.f300f);
            Bundle bundle = this.f301g;
            if (Build.VERSION.SDK_INT < 23 && this.f302h != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f302h);
            }
            builder.setExtras(bundle);
            if (Build.VERSION.SDK_INT >= 23) {
                builder.setMediaUri(this.f302h);
            }
            obj = builder.build();
            this.f303i = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f295a = str;
        this.f296b = charSequence;
        this.f297c = charSequence2;
        this.f298d = charSequence3;
        this.f299e = bitmap;
        this.f300f = uri;
        this.f301g = bundle;
        this.f302h = uri2;
    }
}
