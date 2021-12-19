package com.bytedance.android.monitor.lynx.p715a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.monitor.lynx.a.a */
public final class C11958a {

    /* renamed from: a */
    public String f28582a;

    /* renamed from: b */
    public float f28583b;

    /* renamed from: c */
    public int f28584c;

    /* renamed from: d */
    public int f28585d;

    /* renamed from: e */
    public int f28586e;

    /* renamed from: f */
    public int f28587f;

    /* renamed from: g */
    public List<C11959a> f28588g;

    static {
        Covode.recordClassIndex(13684);
    }

    /* renamed from: a */
    public final String mo19166a() {
        return "BlankDetectData{template='" + this.f28582a + '\'' + ", percentage=" + this.f28583b + ", width=" + this.f28584c + ", height=" + this.f28585d + ", alpha=" + this.f28586e + ", elementCount=" + this.f28587f + '}';
    }

    public final String toString() {
        return "BlankDetectData{template='" + this.f28582a + '\'' + ", percentage=" + this.f28583b + ", width=" + this.f28584c + ", height=" + this.f28585d + ", alpha=" + this.f28586e + ", elementCount=" + this.f28587f + ", dataList=" + this.f28588g + '}';
    }

    /* renamed from: com.bytedance.android.monitor.lynx.a.a$a */
    public static class C11959a {

        /* renamed from: a */
        public int f28589a;

        /* renamed from: b */
        public int f28590b;

        /* renamed from: c */
        public int f28591c;

        /* renamed from: d */
        public int f28592d;

        /* renamed from: e */
        public String f28593e;

        /* renamed from: f */
        public float f28594f;

        /* renamed from: g */
        public float f28595g;

        /* renamed from: h */
        public float f28596h;

        /* renamed from: i */
        public int f28597i;

        /* renamed from: j */
        public int f28598j;

        static {
            Covode.recordClassIndex(13685);
        }

        public final String toString() {
            String str;
            String str2;
            if (this.f28597i == 0) {
                StringBuilder append = new StringBuilder("Element{left=").append(this.f28589a).append(", right=").append(this.f28590b).append(", top=").append(this.f28591c).append(", bottom=").append(this.f28592d).append(", result= ");
                if (this.f28598j == 1) {
                    str2 = "validate";
                } else {
                    str2 = "invalidate";
                }
                return append.append(str2).append(", className='").append(this.f28593e).append('\'').append('}').toString();
            }
            StringBuilder append2 = new StringBuilder("Element{left=").append(this.f28589a).append(", right=").append(this.f28590b).append(", top=").append(this.f28591c).append(", bottom=").append(this.f28592d).append(", alpha=").append(this.f28594f).append(", scaleX=").append(this.f28595g).append(", scaleY=").append(this.f28596h).append(", visibility=");
            if (this.f28597i == 4) {
                str = "invisible";
            } else {
                str = "gone";
            }
            return append2.append(str).append(", className='").append(this.f28593e).append('\'').append('}').toString();
        }
    }

    /* renamed from: a */
    public final void mo19167a(C11959a aVar) {
        if (aVar != null) {
            if (this.f28588g == null) {
                this.f28588g = new ArrayList();
            }
            this.f28588g.add(aVar);
        }
    }
}
