package com.p2082ss.android.ugc.aweme.shortvideo.p3892x;

import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.C14216f;
import com.bytedance.creativex.recorder.filter.p943b.C14224b;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31208c;
import com.p2082ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p2082ss.android.ugc.aweme.beauty.C34808e;
import com.p2082ss.android.ugc.aweme.beauty.C34813i;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50683b;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.utils.C50811a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50687a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65474g;
import com.p2082ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.p2082ss.android.vesdk.C85346av;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.x.m */
public final class C74322m implements AbstractC74319k {

    /* renamed from: a */
    public final AbstractC31193a f167132a;

    /* renamed from: b */
    public FilterBean f167133b = null;

    /* renamed from: c */
    public float f167134c = 0.0f;

    /* renamed from: d */
    public Map<String, Integer> f167135d = new HashMap();

    /* renamed from: e */
    C74314g f167136e = C74314g.f167121a;

    /* renamed from: f */
    int f167137f;

    /* renamed from: g */
    String f167138g = "";

    /* renamed from: h */
    private boolean f167139h;

    /* renamed from: i */
    private int f167140i = C74320l.f167129d;

    /* renamed from: j */
    private int f167141j = -1;

    /* renamed from: k */
    private float f167142k = 0.0f;

    /* renamed from: l */
    private float f167143l = 0.0f;

    /* renamed from: m */
    private float f167144m = 0.0f;

    /* renamed from: n */
    private float f167145n = 0.0f;

    /* renamed from: o */
    private float f167146o = 0.0f;

    /* renamed from: p */
    private float f167147p = 0.0f;

    /* renamed from: q */
    private final C74305a f167148q;

    /* renamed from: r */
    private final C85346av f167149r;

    /* renamed from: s */
    private MessageCenter.Listener f167150s = null;

    static {
        Covode.recordClassIndex(87094);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: a */
    public final void mo116930a(String str, float f) {
        this.f167132a.mo56770a(3, str);
        this.f167132a.mo56764a(f, 0.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: a */
    public final void mo116931a(String str, float f, float f2) {
        this.f167132a.mo56756a(str, f, f2);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: a */
    public final void mo116929a(String str) {
        this.f167148q.mo116914a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: a */
    public final void mo116932a(String str, String str2, float f) {
        AbstractC31193a aVar = this.f167132a;
        if (aVar != null) {
            AbstractC31208c e = aVar.mo56826e();
            e.mo56841a(str, str2, f);
            e.mo56842a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: a */
    public final int[] mo116935a(String str, String str2) {
        return this.f167132a.mo56808c(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: a */
    public final void mo116928a(AbstractC74315h hVar, int i) {
        AbstractC31193a aVar = this.f167132a;
        if (aVar != null) {
            aVar.mo56782a(new C74323n(hVar), i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: a */
    public final void mo116934a(List<String> list, List<String> list2) {
        List<ComposerInfo> c = m130763c(list, list2);
        AbstractC31193a aVar = this.f167132a;
        if (aVar != null) {
            aVar.mo56825d(c, 10000);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: a */
    public final void mo116933a(List<String> list) {
        AbstractC31193a aVar = this.f167132a;
        if (aVar != null) {
            aVar.mo56820a(m130763c(list, Collections.emptyList()));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: f */
    public final void mo116949f() {
        this.f167148q.mo116913a();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: c */
    public final float mo116942c() {
        return (((float) C63244g.m114602a().mo73277e().getUserBigEyeLevel(-1)) * 1.0f) / 100.0f;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: d */
    public final float mo116945d() {
        return (((float) C63244g.m114602a().mo73277e().getUserShapeLevel(-1)) * 1.0f) / 100.0f;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: e */
    public final float mo116947e() {
        return (((float) C63244g.m114602a().mo73277e().getUserSmoothSkinLevel(-1)) * 1.0f) / 100.0f;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: b */
    public final float mo116936b() {
        int i;
        if (C34813i.m71123a("2", "3")) {
            i = C63244g.m114602a().mo73277e().getUserBlushLevel(-1);
        } else {
            i = 0;
        }
        return (((float) i) * 1.0f) / 100.0f;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: a */
    public final float mo116922a() {
        int i;
        if (C34813i.m71123a("2", "3")) {
            i = C63244g.m114602a().mo73277e().getUserLipLevel(-1);
        } else {
            i = 0;
        }
        return (((float) i) * 1.0f) / 100.0f;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: a */
    public final void mo116923a(float f) {
        this.f167132a.mo56753a(9, f);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: b */
    public final void mo116938b(float f) {
        AbstractC31193a aVar = this.f167132a;
        if (aVar != null) {
            aVar.mo56810d(f, 3.0f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: c */
    public final void mo116943c(float f) {
        AbstractC31193a aVar = this.f167132a;
        if (aVar != null) {
            aVar.mo56814e(f, 6.0f);
        }
    }

    /* renamed from: a */
    public static List<ComposerInfo> m130760a(FilterBean filterBean) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ComposerInfo(C50811a.m95158a(filterBean, 0.0f), filterBean.getExtra(), String.valueOf(filterBean.getId())));
        arrayList.add(new ComposerInfo(filterBean.getFilterFolder() + ":leftSlidePosition", filterBean.getExtra(), String.valueOf(filterBean.getId())));
        arrayList.add(new ComposerInfo(filterBean.getFilterFolder() + ":rightSlidePosition", filterBean.getExtra(), String.valueOf(filterBean.getId())));
        return arrayList;
    }

    /* renamed from: a */
    public final String mo116954a(C14224b bVar) {
        if (this.f167137f == 2 && C14216f.m25969a(bVar.f34513c)) {
            FilterBean filterBean = bVar.f34511a;
            List<FilterBean> value = bVar.f34513c.f34498b.mo86071f().mo86074a().getValue();
            if (value != null && !value.isEmpty() && value.get(0).equals(filterBean)) {
                AbstractC50683b b = C63238c.f143565C.mo73290r().mo86004b();
                if (IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).isKorean()) {
                    return b.mo86018d() + "beautify_filter_korean/";
                }
                return b.mo86018d() + "beautify_filter/";
            }
        }
        return C50687a.m94981b(bVar.f34511a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: a */
    public final void mo116926a(int i) {
        C74314g gVar = new C74314g(i);
        this.f167136e = gVar;
        if (gVar.f167122b == 0 && this.f167137f == 2) {
            AbstractC50683b b = C63238c.f143565C.mo73290r().mo86004b();
            if (IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).isKorean()) {
                this.f167132a.mo56783a(b.mo86018d() + "beautify_filter_korean/");
            } else {
                this.f167132a.mo56783a(b.mo86018d() + "beautify_filter/");
            }
        } else {
            this.f167132a.mo56783a(C63238c.f143565C.mo73290r().mo86005c().mo86021b(gVar.f167122b));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: b */
    public final void mo116940b(String str, float f) {
        this.f167148q.mo116915a(str, f);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: d */
    public final void mo116946d(float f, float f2) {
        AbstractC31193a aVar = this.f167132a;
        if (aVar != null) {
            aVar.mo56797b(f, f2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: e */
    public final void mo116948e(float f, float f2) {
        AbstractC31193a aVar = this.f167132a;
        if (aVar != null) {
            aVar.mo56805c(f, f2);
        }
    }

    /* renamed from: c */
    private static List<ComposerInfo> m130763c(List<String> list, List<String> list2) {
        return m130762a(list, list2, Collections.emptyList());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: b */
    public final int mo116937b(String str, String str2) {
        AbstractC31193a aVar = this.f167132a;
        if (aVar != null) {
            return aVar.mo56757a(str, str2);
        }
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: f */
    public final void mo116950f(float f, float f2) {
        AbstractC31193a aVar = this.f167132a;
        if (aVar != null) {
            aVar.mo56816f(f, f2);
        }
    }

    /* renamed from: a */
    public static List<ComposerInfo> m130761a(FilterBean filterBean, float f) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ComposerInfo(C50811a.m95158a(filterBean, f), filterBean.getExtra(), String.valueOf(filterBean.getId())));
        return arrayList;
    }

    public C74322m(C74305a aVar, C85346av avVar) {
        this.f167148q = aVar;
        this.f167132a = aVar.f167093a;
        this.f167149r = avVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: b */
    public final void mo116939b(float f, float f2) {
        this.f167142k = f;
        this.f167143l = f2;
        if (f - 0.0f < 0.001f && f2 - 0.0f < 0.001f) {
            this.f167132a.mo56756a("", 0.0f, 0.0f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: c */
    public final void mo116944c(float f, float f2) {
        String str;
        String str2;
        String str3;
        String str4;
        this.f167144m = f;
        this.f167145n = f2;
        String str5 = "1";
        if (this.f167139h) {
            str = str5;
        } else {
            str = "2";
        }
        if (C34813i.m71123a(str, "3")) {
            if (this.f167139h) {
                str3 = str5;
            } else {
                str3 = "2";
            }
            str2 = C34813i.m71124b(str3, "3");
            if (this.f167139h) {
                str4 = str5;
            } else {
                str4 = "2";
            }
            float a = C34808e.m71118a(3, str4);
            if (a >= 0.0f) {
                f *= a;
            }
            if (!this.f167139h) {
                str5 = "2";
            }
            float a2 = C34808e.m71118a(4, str5);
            if (a >= 0.0f) {
                f2 *= a2;
            }
        } else {
            str2 = "";
        }
        this.f167132a.mo56793b(str2, f, f2);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: b */
    public final void mo116941b(List<String> list, List<String> list2) {
        List<ComposerInfo> c = m130763c(list, list2);
        AbstractC31193a aVar = this.f167132a;
        if (aVar != null) {
            aVar.mo56821a(c, 10000);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: a */
    public final void mo116924a(float f, float f2) {
        String str;
        int a;
        String str2;
        this.f167146o = f;
        this.f167147p = f2;
        String str3 = "2";
        if (this.f167139h) {
            str = "1";
        } else {
            str = str3;
        }
        if (C34813i.m71123a(str, "1")) {
            if (this.f167139h) {
                str2 = "1";
            } else {
                str2 = str3;
            }
            float a2 = C34808e.m71118a(0, str2);
            if (a2 >= 0.0f) {
                f *= a2;
            }
        }
        this.f167132a.mo56764a(f, f2);
        if (f - 0.0f < 0.001f) {
            this.f167132a.mo56770a(0, "");
            return;
        }
        AbstractC31193a aVar = this.f167132a;
        if (this.f167139h) {
            str3 = "1";
        }
        if (C34813i.m71123a(str3, "1")) {
            a = 3;
        } else {
            a = C65474g.m117201a();
            if (a == 0) {
                a = 1;
            }
        }
        aVar.mo56770a(a, this.f167138g);
    }

    /* renamed from: a */
    private static List<ComposerInfo> m130762a(List<String> list, List<String> list2, List<String> list3) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str2 = "";
            if (i < list2.size()) {
                str = list2.get(i);
            } else {
                str = str2;
            }
            if (i < list3.size()) {
                str2 = list3.get(i);
            }
            arrayList.add(new ComposerInfo(list.get(i), str, str2));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo116955b(String str, String str2, float f) {
        String[] strArr = {str, str2};
        String[] strArr2 = {"leftSlidePosition", "rightSlidePosition"};
        float[] fArr = {f, f};
        C85346av avVar = this.f167149r;
        if (avVar != null) {
            avVar.mo130717a(strArr, strArr2, fArr);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: a */
    public final void mo116925a(float f, float f2, float f3, float f4) {
        AbstractC31193a aVar = this.f167132a;
        if (aVar != null) {
            aVar.mo56765a(f, f2, f3, f4, 1.0f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k
    /* renamed from: a */
    public final void mo116927a(int i, float f, float f2, int i2) {
        AbstractC31193a aVar = this.f167132a;
        if (aVar != null) {
            aVar.mo56767a(i, f, f2, i2);
        }
    }
}
