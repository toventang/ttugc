package dmt.p4542av.video;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: dmt.av.video.p */
public final class C88292p {

    /* renamed from: a */
    public int[] f200335a;

    /* renamed from: b */
    public String[] f200336b;

    /* renamed from: c */
    public long f200337c;

    /* renamed from: d */
    public long f200338d;

    /* renamed from: e */
    public long f200339e;

    /* renamed from: f */
    public long f200340f;

    /* renamed from: g */
    public int f200341g;

    /* renamed from: h */
    public boolean f200342h;

    /* renamed from: i */
    public int f200343i;

    /* renamed from: j */
    public String f200344j;

    /* renamed from: k */
    public String f200345k;

    /* renamed from: l */
    public String f200346l;

    /* renamed from: m */
    public int f200347m;

    /* renamed from: n */
    public String f200348n;

    /* renamed from: o */
    public String f200349o;

    static {
        Covode.recordClassIndex(104327);
    }

    public final String toString() {
        return "VEFilterEffectOp{mEffectIndexes=" + Arrays.toString(this.f200335a) + ", mStartTimePoint=" + this.f200337c + ", mOp=" + this.f200341g + ", mReverse=" + this.f200342h + ", mColor=" + this.f200343i + ", mResource='" + this.f200344j + '\'' + ", mName='" + this.f200346l + '\'' + ", mKey='" + this.f200345k + '\'' + '}';
    }

    /* renamed from: a */
    public static C88292p m153426a(long j) {
        C88292p pVar = new C88292p();
        pVar.f200341g = 1;
        pVar.f200337c = j;
        return pVar;
    }

    /* renamed from: b */
    public static C88292p m153431b(String str, long j) {
        C88292p pVar = new C88292p();
        pVar.f200341g = 0;
        pVar.f200344j = str;
        pVar.f200337c = j;
        return pVar;
    }

    /* renamed from: a */
    public static C88292p m153425a(int i, String str) {
        C88292p pVar = new C88292p();
        pVar.f200341g = 7;
        pVar.f200335a = new int[]{i};
        pVar.f200336b = new String[]{str};
        return pVar;
    }

    /* renamed from: b */
    public static C88292p m153432b(int[] iArr, String[] strArr) {
        C88292p pVar = new C88292p();
        pVar.f200341g = 3;
        pVar.f200335a = iArr;
        pVar.f200336b = strArr;
        return pVar;
    }

    /* renamed from: a */
    public static C88292p m153427a(long j, long j2) {
        C88292p pVar = new C88292p();
        pVar.f200341g = 6;
        pVar.f200337c = j;
        pVar.f200338d = j2;
        return pVar;
    }

    /* renamed from: a */
    public static C88292p m153428a(String str, long j) {
        C88292p pVar = new C88292p();
        pVar.f200341g = 5;
        pVar.f200344j = str;
        pVar.f200337c = 0;
        pVar.f200338d = j;
        return pVar;
    }

    /* renamed from: a */
    public static C88292p m153430a(int[] iArr, String[] strArr) {
        C88292p pVar = new C88292p();
        pVar.f200341g = 4;
        pVar.f200335a = iArr;
        pVar.f200336b = strArr;
        return pVar;
    }

    /* renamed from: a */
    public static C88292p m153429a(String str, long j, int i, String str2) {
        C88292p pVar = new C88292p();
        pVar.f200341g = 8;
        pVar.f200344j = str;
        pVar.f200337c = 0;
        pVar.f200338d = j;
        pVar.f200335a = new int[]{i};
        pVar.f200336b = new String[]{str2};
        return pVar;
    }
}
