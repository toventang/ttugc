package com.p2082ss.android.ugc.aweme.livewallpaper;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3416d.C58882c;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58895d;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58901f;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58905h;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.WallPaperDataProvider */
public class WallPaperDataProvider extends ContentProvider {

    /* renamed from: a */
    public static final String f133885a = "com.ss.android.ugc.trill.wallpapercaller";

    /* renamed from: b */
    public static final Uri f133886b = Uri.parse("content://" + "com.ss.android.ugc.trill.wallpapercaller" + "/video_path");

    /* renamed from: c */
    public static final Uri f133887c = Uri.parse("content://" + "com.ss.android.ugc.trill.wallpapercaller" + "/video_width");

    /* renamed from: d */
    public static final Uri f133888d = Uri.parse("content://" + "com.ss.android.ugc.trill.wallpapercaller" + "/video_height");

    /* renamed from: e */
    public static final Uri f133889e = Uri.parse("content://" + "com.ss.android.ugc.trill.wallpapercaller" + "/ab_info");

    /* renamed from: f */
    public static final Uri f133890f = Uri.parse("content://" + "com.ss.android.ugc.trill.wallpapercaller" + "/wallpaper_json");

    /* renamed from: g */
    public static final Uri f133891g = Uri.parse("content://" + "com.ss.android.ugc.trill.wallpapercaller" + "/fall_back_video_path");

    /* renamed from: h */
    public static final Uri f133892h = Uri.parse("content://" + "com.ss.android.ugc.trill.wallpapercaller" + "/set_wp_result");

    /* renamed from: i */
    public static final Uri f133893i = Uri.parse("content://" + "com.ss.android.ugc.trill.wallpapercaller" + "/source");

    /* renamed from: j */
    public static final Uri f133894j = Uri.parse("content://" + "com.ss.android.ugc.trill.wallpapercaller" + "/volume");

    /* renamed from: k */
    public static final Uri f133895k = Uri.parse("content://" + "com.ss.android.ugc.trill.wallpapercaller" + "/need_tighten");

    /* renamed from: l */
    private UriMatcher f133896l;

    /* renamed from: m */
    private Handler f133897m;

    public boolean onCreate() {
        this.f133896l = new UriMatcher(-1);
        String str = f133885a;
        if (!TextUtils.isEmpty(str)) {
            this.f133896l.addURI(str, "ab_info", 145);
            this.f133896l.addURI(str, "wallpaper_json", 144);
            this.f133896l.addURI(str, "video_path", 16);
            this.f133896l.addURI(str, "fall_back_video_path", 32);
            this.f133896l.addURI(str, "set_wp_result", 48);
            this.f133896l.addURI(str, "video_width", 64);
            this.f133896l.addURI(str, "video_height", 80);
            this.f133896l.addURI(str, "source", 96);
            this.f133896l.addURI(str, "volume", 112);
            this.f133896l.addURI(str, "need_tighten", 128);
        }
        this.f133897m = new Handler(Looper.getMainLooper());
        return false;
    }

    static {
        Covode.recordClassIndex(69133);
    }

    /* renamed from: a */
    private static String m108027a(ContentValues contentValues) {
        return "{" + contentValues.toString() + "}";
    }

    /* renamed from: a */
    private static String m108029a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < strArr.length; i++) {
            sb.append(strArr[i]);
            if (i < strArr.length - 2) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    private static String m108028a(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] instanceof Uri) {
                sb.append(((Uri) objArr[i]).toString());
            } else if (objArr[i] instanceof String[]) {
                sb.append(m108029a((String[]) objArr[i]));
            } else if (objArr[i] instanceof String) {
                sb.append(objArr[i]);
            } else if (objArr[i] instanceof ContentValues) {
                sb.append(m108027a((ContentValues) objArr[i]));
            }
            if (i < objArr.length - 2) {
                sb.append("---");
            }
        }
        return sb.toString();
    }

    public String getType(Uri uri) {
        m108028a(uri);
        int match = this.f133896l.match(uri);
        if (match == 16) {
            return C58895d.f134069e.f134072c.getVideoPath();
        }
        if (match == 32) {
            return C58895d.f134069e.f134072c.getVideoPath();
        }
        if (match == 64) {
            return String.valueOf(C58895d.f134069e.f134072c.getWidth());
        }
        if (match == 80) {
            return String.valueOf(C58895d.f134069e.f134072c.getHeight());
        }
        if (match == 96) {
            return C58895d.f134069e.f134072c.getSource();
        }
        if (match == 112) {
            return String.valueOf(C58895d.f134069e.f134072c.getVolume());
        }
        if (match == 128) {
            return String.valueOf(C80580in.m139689d());
        }
        if (match == 144) {
            return C58882c.m108182a(C58895d.f134069e.f134072c);
        }
        if (match != 145) {
            return "";
        }
        return C58882c.m108184b();
    }

    public Uri insert(Uri uri, final ContentValues contentValues) {
        m108028a(uri, contentValues);
        if (!(contentValues == null || contentValues.size() == 0 || this.f133896l.match(uri) != 48)) {
            this.f133897m.post(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.livewallpaper.WallPaperDataProvider.RunnableC588201 */

                static {
                    Covode.recordClassIndex(69134);
                }

                public final void run() {
                    boolean z;
                    C58895d.AbstractC58899a aVar;
                    if (contentValues.getAsBoolean("result") != null) {
                        z = contentValues.getAsBoolean("result").booleanValue();
                    } else {
                        z = false;
                    }
                    String asString = contentValues.getAsString("source");
                    String asString2 = contentValues.getAsString("message");
                    C58895d dVar = C58895d.f134069e;
                    if (dVar.f134073d.size() != 0 && (aVar = dVar.f134073d.get(asString)) != null) {
                        aVar.mo96314a(z, asString2);
                    }
                }
            });
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        String str2;
        int match = this.f133896l.match(uri);
        if (match == 16) {
            str2 = C58895d.f134069e.f134072c.getVideoPath();
        } else if (match != 32) {
            str2 = "";
        } else {
            str2 = C58901f.m108231b();
        }
        try {
            return ParcelFileDescriptor.open(new File(str2), 268435456);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        m108028a(uri, str, strArr);
        return 0;
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        str.hashCode();
        if (str.equals("update_preferences")) {
            try {
                JSONObject jSONObject = new JSONObject(bundle.getString("wallpaper_preferences"));
                boolean optBoolean = jSONObject.optBoolean("enablePauseVideo", false);
                int optInt = jSONObject.optInt("soundProgress", 0);
                C58905h.m108240a(optBoolean);
                C58905h.m108239a(optInt);
            } catch (Exception unused) {
            }
        }
        return bundle;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        m108028a(uri, contentValues, str, strArr);
        return 0;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        m108028a(uri, strArr, str, strArr2, str2);
        return null;
    }
}
