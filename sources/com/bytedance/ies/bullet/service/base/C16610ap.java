package com.bytedance.ies.bullet.service.base;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.json.JSONArray;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.ap */
public class C16610ap {

    /* renamed from: y */
    public static final C16611a f39748y = new C16611a((byte) 0);

    /* renamed from: i */
    public String f39749i;

    /* renamed from: j */
    public WebResourceResponse f39750j;

    /* renamed from: k */
    public C16607an f39751k;

    /* renamed from: l */
    public C16607an f39752l;

    /* renamed from: m */
    public JSONArray f39753m;

    /* renamed from: n */
    public final Uri f39754n;

    /* renamed from: o */
    public String f39755o = null;

    /* renamed from: p */
    public EnumC16613ar f39756p = null;

    /* renamed from: q */
    public EnumC16609ao f39757q = null;

    /* renamed from: r */
    public boolean f39758r = false;

    /* renamed from: s */
    public long f39759s = 0;

    /* renamed from: t */
    public boolean f39760t;

    /* renamed from: u */
    public InputStream f39761u;

    /* renamed from: v */
    public C16630d f39762v;

    /* renamed from: w */
    public String f39763w;

    /* renamed from: x */
    public long f39764x;

    static {
        Covode.recordClassIndex(19047);
    }

    /* renamed from: com.bytedance.ies.bullet.service.base.ap$a */
    public static final class C16611a {
        static {
            Covode.recordClassIndex(19048);
        }

        private C16611a() {
        }

        public /* synthetic */ C16611a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final String mo26372b() {
        EnumC16609ao aoVar = this.f39757q;
        if (aoVar == null) {
            return "custom";
        }
        int i = C16612aq.f39766b[aoVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "custom";
                    }
                    return "offline";
                } else if (this.f39758r) {
                    return "cdnCache";
                } else {
                    return "cdn";
                }
            } else if (this.f39756p == EnumC16613ar.ASSET) {
                return "buildin";
            } else {
                return "offline";
            }
        } else if (this.f39758r) {
            return "gecko";
        } else {
            return "geckoUpdate";
        }
    }

    /* renamed from: a */
    public InputStream mo25913a() {
        MethodCollector.m26663i(8784);
        String str = this.f39755o;
        if (str == null) {
            str = "";
        }
        File file = new File(str);
        InputStream inputStream = this.f39761u;
        if (inputStream != null) {
            MethodCollector.m26664o(8784);
            return inputStream;
        } else if (!file.exists() || file.isDirectory()) {
            MethodCollector.m26664o(8784);
            return null;
        } else {
            FileInputStream fileInputStream = new FileInputStream(file);
            MethodCollector.m26664o(8784);
            return fileInputStream;
        }
    }

    public String toString() {
        return "[srcUri=" + this.f39754n + ", filePath=" + this.f39755o + ", type=" + this.f39756p + ',' + "from=" + this.f39757q + ", fileStream=" + this.f39761u + ", model=" + this.f39762v + ']';
    }

    /* renamed from: a */
    public final void mo26370a(C16607an anVar) {
        C89219l.m154719c(anVar, "");
        this.f39751k = anVar;
    }

    /* renamed from: b */
    public final void mo26373b(C16607an anVar) {
        C89219l.m154719c(anVar, "");
        this.f39752l = anVar;
    }

    /* renamed from: e */
    public final void mo26374e(String str) {
        C89219l.m154719c(str, "");
        this.f39749i = str;
    }

    /* renamed from: f */
    public final void mo26375f(String str) {
        C89219l.m154719c(str, "");
        this.f39763w = str;
    }

    /* renamed from: a */
    public final void mo26371a(JSONArray jSONArray) {
        C89219l.m154719c(jSONArray, "");
        this.f39753m = jSONArray;
    }

    /* renamed from: a */
    public final File mo26369a(File file) {
        String str = this.f39755o;
        if (str == null) {
            str = "";
        }
        EnumC16613ar arVar = this.f39756p;
        if (arVar == null || C16612aq.f39765a[arVar.ordinal()] != 1) {
            return new File(str);
        }
        if (file != null) {
            return new File(file, str);
        }
        return new File(str);
    }

    public C16610ap(Uri uri, String str, EnumC16613ar arVar, EnumC16609ao aoVar, boolean z, long j, boolean z2, InputStream inputStream, C16630d dVar, String str2, long j2) {
        C89219l.m154719c(uri, "");
        C89219l.m154719c(str2, "");
        this.f39754n = uri;
        this.f39760t = z2;
        this.f39761u = null;
        this.f39762v = null;
        this.f39763w = str2;
        this.f39764x = j2;
        this.f39749i = "";
        this.f39751k = new C16607an("bdx_resourceloader_fetch", null, null, 254);
        this.f39752l = new C16607an("bdx_resourceloader_performance", null, null, 254);
        this.f39753m = new JSONArray();
    }
}
