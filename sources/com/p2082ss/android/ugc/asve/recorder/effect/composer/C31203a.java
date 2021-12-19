package com.p2082ss.android.ugc.asve.recorder.effect.composer;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.asve.recorder.effect.composer.a */
public final class C31203a implements AbstractC31208c {

    /* renamed from: c */
    public static final C31204a f74793c = new C31204a((byte) 0);

    /* renamed from: a */
    public final ArrayList<C31205b> f74794a = new ArrayList<>();

    /* renamed from: b */
    public final ArrayList<C31205b> f74795b = new ArrayList<>();

    /* renamed from: d */
    private final AbstractC31206b f74796d;

    static {
        Covode.recordClassIndex(37849);
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.composer.a$a */
    public static final class C31204a {
        static {
            Covode.recordClassIndex(37850);
        }

        private C31204a() {
        }

        public /* synthetic */ C31204a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31208c
    /* renamed from: a */
    public final void mo56842a() {
        List<ComposerInfo> list;
        AbstractC31206b bVar = this.f74796d;
        if (bVar instanceof C31209d) {
            C31209d dVar = (C31209d) bVar;
            C89219l.m154721d(this, "");
            if (this.f74794a.size() > 0) {
                for (T t : this.f74794a) {
                    int i = t.f74797a;
                    if (i == 0) {
                        dVar.f74806a.clear();
                        dVar.f74807b.mo130713a(new String[0]);
                    } else if (i == 1) {
                        List<ComposerInfo> list2 = dVar.f74806a.get(Integer.valueOf(t.f74798b));
                        if (list2 == null) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new ComposerInfo(t.f74799c, t.f74802f));
                            dVar.f74806a.put(Integer.valueOf(t.f74798b), arrayList);
                        } else {
                            list2.add(new ComposerInfo(t.f74799c, t.f74802f));
                        }
                    } else if (i == 2) {
                        dVar.mo56845a(t.f74799c);
                    } else if (i == 3) {
                        dVar.f74806a.remove(Integer.valueOf(t.f74798b));
                    }
                }
                dVar.mo56844a();
            }
            for (T t2 : this.f74795b) {
                if (!(t2.f74798b == -1 || (list = dVar.f74806a.get(Integer.valueOf(t2.f74798b))) == null)) {
                    for (T t3 : list) {
                        if (C89361p.m154929e((CharSequence) t3.f74790a, (CharSequence) (t2.f74799c + ";" + t2.f74800d))) {
                            String str = t2.f74799c + ";" + t2.f74800d + ";" + t2.f74801e;
                            C89219l.m154721d(str, "");
                            t3.f74790a = str;
                        }
                    }
                }
                dVar.f74807b.mo130709a(t2.f74799c, t2.f74800d, t2.f74801e);
            }
            this.f74794a.clear();
            this.f74795b.clear();
            return;
        }
        throw new Exception("should not go this case ");
    }

    public C31203a(AbstractC31206b bVar) {
        C89219l.m154721d(bVar, "");
        this.f74796d = bVar;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31208c
    /* renamed from: a */
    public final AbstractC31208c mo56841a(String str, String str2, float f) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f74795b.add(new C31205b(this, str, str2, f));
        return this;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31208c
    /* renamed from: b */
    public final AbstractC31208c mo56843b(String str, String str2, float f) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f74795b.add(new C31205b(this, 60000, str, str2, f));
        return this;
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.composer.a$b */
    public final class C31205b {

        /* renamed from: a */
        public int f74797a;

        /* renamed from: b */
        public int f74798b;

        /* renamed from: c */
        public String f74799c;

        /* renamed from: d */
        public String f74800d;

        /* renamed from: e */
        public float f74801e;

        /* renamed from: f */
        public String f74802f;

        /* renamed from: g */
        final /* synthetic */ C31203a f74803g;

        static {
            Covode.recordClassIndex(37851);
        }

        public C31205b(C31203a aVar, String str, String str2, float f) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f74803g = aVar;
            this.f74797a = 1;
            this.f74798b = -1;
            this.f74799c = "";
            this.f74800d = "";
            this.f74802f = "";
            this.f74797a = 4;
            this.f74799c = str;
            this.f74800d = str2;
            this.f74801e = f;
        }

        public C31205b(C31203a aVar, int i, String str, String str2, float f) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f74803g = aVar;
            this.f74797a = 1;
            this.f74798b = -1;
            this.f74799c = "";
            this.f74800d = "";
            this.f74802f = "";
            this.f74798b = 60000;
            this.f74797a = 4;
            this.f74799c = str;
            this.f74800d = str2;
            this.f74801e = f;
        }
    }
}
