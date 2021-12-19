package com.bytedance.android.monitorV2.lynx.p741a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.monitorV2.lynx.a.a */
public final class C12137a {

    /* renamed from: a */
    public String f29157a;

    /* renamed from: b */
    public float f29158b;

    /* renamed from: c */
    public int f29159c;

    /* renamed from: d */
    public int f29160d;

    /* renamed from: e */
    public int f29161e;

    /* renamed from: f */
    public int f29162f;

    /* renamed from: g */
    public List<C12138a> f29163g;

    static {
        Covode.recordClassIndex(13866);
    }

    /* renamed from: a */
    public final String mo19505a() {
        return "BlankDetectData{template='" + this.f29157a + '\'' + ", percentage=" + this.f29158b + ", width=" + this.f29159c + ", height=" + this.f29160d + ", alpha=" + this.f29161e + ", elementCount=" + this.f29162f + '}';
    }

    public final String toString() {
        return "BlankDetectData{template='" + this.f29157a + '\'' + ", percentage=" + this.f29158b + ", width=" + this.f29159c + ", height=" + this.f29160d + ", alpha=" + this.f29161e + ", elementCount=" + this.f29162f + ", dataList=" + this.f29163g + '}';
    }

    /* renamed from: com.bytedance.android.monitorV2.lynx.a.a$a */
    public static class C12138a {

        /* renamed from: a */
        public int f29164a;

        /* renamed from: b */
        public int f29165b;

        /* renamed from: c */
        public int f29166c;

        /* renamed from: d */
        public int f29167d;

        /* renamed from: e */
        public String f29168e;

        /* renamed from: f */
        public float f29169f;

        /* renamed from: g */
        public float f29170g;

        /* renamed from: h */
        public float f29171h;

        /* renamed from: i */
        public int f29172i;

        /* renamed from: j */
        public int f29173j;

        static {
            Covode.recordClassIndex(13867);
        }

        public final String toString() {
            String str;
            String str2;
            if (this.f29172i == 0) {
                StringBuilder append = new StringBuilder("Element{left=").append(this.f29164a).append(", right=").append(this.f29165b).append(", top=").append(this.f29166c).append(", bottom=").append(this.f29167d).append(", result= ");
                if (this.f29173j == 1) {
                    str2 = "validate";
                } else {
                    str2 = "invalidate";
                }
                return append.append(str2).append(", className='").append(this.f29168e).append('\'').append('}').toString();
            }
            StringBuilder append2 = new StringBuilder("Element{left=").append(this.f29164a).append(", right=").append(this.f29165b).append(", top=").append(this.f29166c).append(", bottom=").append(this.f29167d).append(", alpha=").append(this.f29169f).append(", scaleX=").append(this.f29170g).append(", scaleY=").append(this.f29171h).append(", visibility=");
            if (this.f29172i == 4) {
                str = "invisible";
            } else {
                str = "gone";
            }
            return append2.append(str).append(", className='").append(this.f29168e).append('\'').append('}').toString();
        }
    }

    /* renamed from: a */
    public final void mo19506a(C12138a aVar) {
        if (aVar != null) {
            if (this.f29163g == null) {
                this.f29163g = new ArrayList();
            }
            this.f29163g.add(aVar);
        }
    }
}
