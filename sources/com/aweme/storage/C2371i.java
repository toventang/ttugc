package com.aweme.storage;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.List;

/* renamed from: com.aweme.storage.i */
public final class C2371i {

    /* renamed from: a */
    public String f7208a;

    /* renamed from: b */
    public String f7209b;

    /* renamed from: c */
    public long f7210c;

    /* renamed from: d */
    public List<C2372a> f7211d;

    static {
        Covode.recordClassIndex(2649);
    }

    /* renamed from: a */
    public final void mo6535a() {
        List<C2372a> list;
        if (!(TextUtils.isEmpty(this.f7208a) || (list = this.f7211d) == null || list.isEmpty())) {
            for (C2372a aVar : this.f7211d) {
                if (aVar != null) {
                    aVar.mo6536a(this.f7208a);
                }
            }
            this.f7210c = C2367e.m7202a(this.f7208a);
        }
    }

    /* renamed from: com.aweme.storage.i$a */
    public static class C2372a {

        /* renamed from: a */
        public String f7212a;

        /* renamed from: b */
        public String f7213b;

        /* renamed from: c */
        public long f7214c;

        /* renamed from: d */
        public File f7215d;

        static {
            Covode.recordClassIndex(2650);
        }

        /* renamed from: a */
        public final void mo6536a(String str) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f7212a)) {
                String str2 = str + File.separator + this.f7212a;
                File file = new File(str2);
                this.f7215d = file;
                if (file.exists()) {
                    this.f7214c = C2367e.m7202a(str2);
                }
            }
        }

        public C2372a(String str, String str2) {
            this.f7213b = str2;
            this.f7212a = str;
        }
    }

    public C2371i(String str, String str2) {
        this.f7209b = str;
        this.f7208a = str2;
    }

    public C2371i(String str, String str2, List<C2372a> list) {
        this.f7209b = str;
        this.f7208a = str2;
        this.f7211d = list;
    }
}
