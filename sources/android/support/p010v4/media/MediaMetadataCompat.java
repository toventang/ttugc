package android.support.p010v4.media;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p010v4.media.session.MediaSessionCompat;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;

/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new Parcelable.Creator<MediaMetadataCompat>() {
        /* class android.support.p010v4.media.MediaMetadataCompat.C01001 */

        static {
            Covode.recordClassIndex(112);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }
    };

    /* renamed from: a */
    static final C0484a<String, Integer> f312a;

    /* renamed from: d */
    private static final String[] f313d = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};

    /* renamed from: e */
    private static final String[] f314e = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};

    /* renamed from: f */
    private static final String[] f315f = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};

    /* renamed from: b */
    public final Bundle f316b;

    /* renamed from: c */
    public Object f317c;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final Bundle mo111a() {
        return new Bundle(this.f316b);
    }

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    public static final class C0101a {

        /* renamed from: a */
        private final Bundle f318a;

        static {
            Covode.recordClassIndex(113);
        }

        public C0101a() {
            this.f318a = new Bundle();
        }

        /* renamed from: a */
        public final MediaMetadataCompat mo119a() {
            return new MediaMetadataCompat(this.f318a);
        }

        private C0101a(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f316b);
            this.f318a = bundle;
            MediaSessionCompat.m227a(bundle);
        }

        /* renamed from: a */
        private static Object m183a(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception | OutOfMemoryError unused) {
                return null;
            }
        }

        /* renamed from: a */
        public final C0101a mo116a(String str, long j) {
            if (!MediaMetadataCompat.f312a.containsKey(str) || MediaMetadataCompat.f312a.get(str).intValue() == 0) {
                this.f318a.putLong(str, j);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        public C0101a(MediaMetadataCompat mediaMetadataCompat, int i) {
            this(mediaMetadataCompat);
            for (String str : this.f318a.keySet()) {
                Object a = m183a(this.f318a, str);
                if (a instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) a;
                    if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                        float f = (float) i;
                        float min = Math.min(f / ((float) bitmap.getWidth()), f / ((float) bitmap.getHeight()));
                        mo117a(str, Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), true));
                    }
                }
            }
        }

        /* renamed from: a */
        public final C0101a mo117a(String str, Bitmap bitmap) {
            if (!MediaMetadataCompat.f312a.containsKey(str) || MediaMetadataCompat.f312a.get(str).intValue() == 2) {
                this.f318a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        /* renamed from: a */
        public final C0101a mo118a(String str, String str2) {
            if (!MediaMetadataCompat.f312a.containsKey(str) || MediaMetadataCompat.f312a.get(str).intValue() == 1) {
                this.f318a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }
    }

    static {
        Covode.recordClassIndex(111);
        C0484a<String, Integer> aVar = new C0484a<>();
        f312a = aVar;
        aVar.put("android.media.metadata.TITLE", 1);
        aVar.put("android.media.metadata.ARTIST", 1);
        aVar.put("android.media.metadata.DURATION", 0);
        aVar.put("android.media.metadata.ALBUM", 1);
        aVar.put("android.media.metadata.AUTHOR", 1);
        aVar.put("android.media.metadata.WRITER", 1);
        aVar.put("android.media.metadata.COMPOSER", 1);
        aVar.put("android.media.metadata.COMPILATION", 1);
        aVar.put("android.media.metadata.DATE", 1);
        aVar.put("android.media.metadata.YEAR", 0);
        aVar.put("android.media.metadata.GENRE", 1);
        aVar.put("android.media.metadata.TRACK_NUMBER", 0);
        aVar.put("android.media.metadata.NUM_TRACKS", 0);
        aVar.put("android.media.metadata.DISC_NUMBER", 0);
        aVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        aVar.put("android.media.metadata.ART", 2);
        aVar.put("android.media.metadata.ART_URI", 1);
        aVar.put("android.media.metadata.ALBUM_ART", 2);
        aVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        aVar.put("android.media.metadata.USER_RATING", 3);
        aVar.put("android.media.metadata.RATING", 3);
        aVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        aVar.put("android.media.metadata.DISPLAY_ICON", 2);
        aVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        aVar.put("android.media.metadata.MEDIA_ID", 1);
        aVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        aVar.put("android.media.metadata.MEDIA_URI", 1);
        aVar.put("android.media.metadata.ADVERTISEMENT", 0);
        aVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f316b = bundle2;
        MediaSessionCompat.m227a(bundle2);
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f316b = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f316b);
    }
}
