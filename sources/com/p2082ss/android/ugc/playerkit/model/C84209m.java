package com.p2082ss.android.ugc.playerkit.model;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63037g;
import com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84178c;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.playerkit.model.m */
public class C84209m {

    /* renamed from: A */
    public boolean f188040A;

    /* renamed from: B */
    public boolean f188041B;

    /* renamed from: C */
    public int f188042C;

    /* renamed from: D */
    public int f188043D = 30;

    /* renamed from: E */
    public int f188044E = 576;

    /* renamed from: F */
    public int f188045F = 1024;

    /* renamed from: G */
    public boolean f188046G;

    /* renamed from: H */
    public boolean f188047H = true;

    /* renamed from: I */
    public boolean f188048I;

    /* renamed from: J */
    public int f188049J;

    /* renamed from: K */
    public int f188050K;

    /* renamed from: L */
    public int f188051L;

    /* renamed from: M */
    public int f188052M = 2;

    /* renamed from: N */
    public C84210a f188053N;

    /* renamed from: O */
    public boolean f188054O;

    /* renamed from: P */
    public boolean f188055P;

    /* renamed from: Q */
    public int f188056Q;

    /* renamed from: R */
    public int f188057R;

    /* renamed from: S */
    public List<C84202f> f188058S;

    /* renamed from: a */
    public Context f188059a;

    /* renamed from: b */
    public EnumC84214e f188060b;

    /* renamed from: c */
    public boolean f188061c;

    /* renamed from: d */
    public AbstractC84178c f188062d;

    /* renamed from: e */
    public SparseIntArray f188063e;

    /* renamed from: f */
    public SparseArray f188064f;

    /* renamed from: g */
    public C84211b f188065g;

    /* renamed from: h */
    public int f188066h;

    /* renamed from: i */
    public boolean f188067i;

    /* renamed from: j */
    public AbstractC84213d f188068j;

    /* renamed from: k */
    public C84212c f188069k;

    /* renamed from: l */
    public boolean f188070l = true;

    /* renamed from: m */
    public int f188071m = 1;

    /* renamed from: n */
    public int f188072n;

    /* renamed from: o */
    public boolean f188073o = true;

    /* renamed from: p */
    public int f188074p;

    /* renamed from: q */
    public int f188075q;

    /* renamed from: r */
    public int f188076r;

    /* renamed from: s */
    public AbstractC63037g f188077s;

    /* renamed from: t */
    public boolean f188078t;

    /* renamed from: u */
    public int f188079u;

    /* renamed from: v */
    public int f188080v;

    /* renamed from: w */
    public int f188081w;

    /* renamed from: x */
    public boolean f188082x;

    /* renamed from: y */
    public int f188083y;

    /* renamed from: z */
    public int f188084z;

    /* renamed from: com.ss.android.ugc.playerkit.model.m$a */
    public static class C84210a {

        /* renamed from: a */
        public int f188085a = 200;

        /* renamed from: b */
        public int f188086b = 1000;

        /* renamed from: c */
        public int f188087c = 5000;

        /* renamed from: d */
        public float f188088d = 9.0f;

        /* renamed from: e */
        public int f188089e = 200;

        /* renamed from: f */
        public int f188090f;

        static {
            Covode.recordClassIndex(98117);
        }
    }

    /* renamed from: com.ss.android.ugc.playerkit.model.m$c */
    public static class C84212c {

        /* renamed from: a */
        public String f188107a;

        /* renamed from: b */
        public Map<String, String> f188108b;

        static {
            Covode.recordClassIndex(98119);
        }
    }

    /* renamed from: com.ss.android.ugc.playerkit.model.m$d */
    public interface AbstractC84213d {
        static {
            Covode.recordClassIndex(98120);
        }

        /* renamed from: a */
        String mo124411a();

        /* renamed from: b */
        Map<String, String> mo124412b();
    }

    static {
        Covode.recordClassIndex(98116);
    }

    /* renamed from: a */
    public final void mo129005a() {
        this.f188066h |= 1;
    }

    /* renamed from: b */
    public final void mo129006b() {
        this.f188066h |= 2;
    }

    /* renamed from: com.ss.android.ugc.playerkit.model.m$b */
    public static class C84211b {

        /* renamed from: a */
        public static int f188091a = 1048576;

        /* renamed from: b */
        public static int f188092b = 409600;

        /* renamed from: c */
        public int f188093c = f188091a;

        /* renamed from: d */
        public int f188094d = f188092b;

        /* renamed from: e */
        public int f188095e = 1;

        /* renamed from: f */
        public int f188096f = 1;

        /* renamed from: g */
        public int f188097g = 2;

        /* renamed from: h */
        public int f188098h;

        /* renamed from: i */
        public int f188099i;

        /* renamed from: j */
        public int f188100j = 2;

        /* renamed from: k */
        public int f188101k = 5000;

        /* renamed from: l */
        public int f188102l = 10000;

        /* renamed from: m */
        public int f188103m;

        /* renamed from: n */
        public int f188104n;

        /* renamed from: o */
        public int f188105o;

        /* renamed from: p */
        public int f188106p;

        static {
            Covode.recordClassIndex(98118);
        }
    }

    /* renamed from: com.ss.android.ugc.playerkit.model.m$e */
    public enum EnumC84214e {
        Ijk,
        IjkHardware,
        TT,
        EXO,
        TT_IJK_ENGINE,
        TT_HARDWARE,
        LIVE;

        static {
            Covode.recordClassIndex(98121);
        }
    }
}
