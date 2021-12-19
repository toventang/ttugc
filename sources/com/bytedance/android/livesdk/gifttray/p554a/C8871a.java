package com.bytedance.android.livesdk.gifttray.p554a;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.gifttray.a.a */
public final class C8871a {

    /* renamed from: A */
    public boolean f21833A;

    /* renamed from: B */
    public int f21834B;

    /* renamed from: C */
    public final C9895y f21835C;

    /* renamed from: a */
    public String f21836a;

    /* renamed from: b */
    public int f21837b;

    /* renamed from: c */
    public EnumC8872a f21838c;

    /* renamed from: d */
    public int f21839d;

    /* renamed from: e */
    public int f21840e;

    /* renamed from: f */
    public boolean f21841f;

    /* renamed from: g */
    public boolean f21842g;

    /* renamed from: h */
    public int f21843h;

    /* renamed from: i */
    public int f21844i;

    /* renamed from: j */
    public int f21845j;

    /* renamed from: k */
    public int f21846k;

    /* renamed from: l */
    public String f21847l;

    /* renamed from: m */
    public long f21848m;

    /* renamed from: n */
    public long f21849n;

    /* renamed from: o */
    public long f21850o;

    /* renamed from: p */
    public long f21851p;

    /* renamed from: q */
    public long f21852q;

    /* renamed from: r */
    public long f21853r;

    /* renamed from: s */
    public long f21854s;

    /* renamed from: t */
    public long f21855t;

    /* renamed from: u */
    public long f21856u;

    /* renamed from: v */
    public CharSequence f21857v;

    /* renamed from: w */
    public ImageModel f21858w;

    /* renamed from: x */
    public CharSequence f21859x;

    /* renamed from: y */
    public long f21860y;

    /* renamed from: z */
    public User f21861z;

    /* renamed from: com.bytedance.android.livesdk.gifttray.a.a$a */
    public enum EnumC8872a {
        NONE,
        VIDEO_ONLY,
        TRAY_ONLY;

        static {
            Covode.recordClassIndex(9756);
        }
    }

    static {
        Covode.recordClassIndex(9755);
    }

    private /* synthetic */ C8871a() {
        this(null);
    }

    /* renamed from: a */
    public final int mo15120a() {
        return this.f21839d - this.f21840e;
    }

    /* renamed from: b */
    public final void mo15124b() {
        this.f21840e++;
    }

    /* renamed from: c */
    public final void mo15126c() {
        this.f21840e = this.f21839d;
    }

    /* renamed from: a */
    public final void mo15121a(EnumC8872a aVar) {
        C89219l.m154721d(aVar, "");
        this.f21838c = aVar;
    }

    /* renamed from: b */
    public final void mo15125b(String str) {
        C89219l.m154721d(str, "");
        this.f21847l = str;
    }

    /* renamed from: a */
    public final void mo15122a(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        this.f21859x = charSequence;
    }

    /* renamed from: a */
    public final void mo15123a(String str) {
        C89219l.m154721d(str, "");
        this.f21836a = str;
    }

    public C8871a(C9895y yVar) {
        int i;
        int i2;
        ImageModel imageModel;
        long j;
        C9904t tVar;
        C9904t tVar2;
        this.f21835C = yVar;
        this.f21836a = "";
        this.f21838c = EnumC8872a.NONE;
        int i3 = 0;
        if (yVar != null) {
            i = yVar.f23939n;
        } else {
            i = 0;
        }
        this.f21839d = i;
        if (yVar != null) {
            i2 = yVar.f23939n;
        } else {
            i2 = 0;
        }
        this.f21840e = i2;
        this.f21843h = 1;
        this.f21847l = "0";
        this.f21857v = "";
        User user = null;
        if (yVar == null || (tVar2 = yVar.f23945t) == null) {
            imageModel = null;
        } else {
            imageModel = tVar2.f23997b;
        }
        this.f21858w = imageModel;
        this.f21859x = "";
        if (yVar != null) {
            j = yVar.f23934i;
        } else {
            j = 0;
        }
        this.f21860y = j;
        this.f21861z = yVar != null ? yVar.f23932g : user;
        if (!(yVar == null || (tVar = yVar.f23945t) == null)) {
            i3 = tVar.f24001f;
        }
        this.f21834B = i3;
    }
}
