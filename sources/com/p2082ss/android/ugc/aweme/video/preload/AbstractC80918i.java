package com.p2082ss.android.ugc.aweme.video.preload;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.android.ugc.playerkit.model.C84227x;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.video.preload.i */
public interface AbstractC80918i {
    static {
        Covode.recordClassIndex(94217);
    }

    /* renamed from: a */
    long mo124061a(String str);

    /* renamed from: a */
    AbstractC80915g mo124062a(EnumC80919a aVar);

    /* renamed from: a */
    Object mo124063a(C84241i iVar, String str, String[] strArr);

    /* renamed from: a */
    void mo124064a(AbstractC80914f fVar);

    /* renamed from: a */
    void mo124065a(AbstractC80921k kVar);

    /* renamed from: a */
    void mo124066a(C84241i iVar, String str, AbstractC80872d dVar);

    /* renamed from: a */
    void mo124067a(Map<String, String> map);

    /* renamed from: a */
    boolean mo124068a();

    /* renamed from: a */
    boolean mo124069a(C84241i iVar);

    /* renamed from: a */
    boolean mo124070a(C84241i iVar, int i, AbstractC80929n nVar);

    /* renamed from: a */
    boolean mo124071a(C84241i iVar, int i, AbstractC80929n nVar, AbstractC80915g.C80916a aVar, List<C84241i> list, List<C84241i> list2, int i2);

    /* renamed from: a */
    boolean mo124072a(C84241i iVar, int i, List<C84241i> list, List<C84241i> list2, int i2);

    /* renamed from: b */
    long mo124073b(String str);

    /* renamed from: b */
    File mo124074b();

    /* renamed from: b */
    boolean mo124075b(C84241i iVar);

    /* renamed from: b */
    boolean mo124076b(C84241i iVar, int i, AbstractC80929n nVar);

    /* renamed from: c */
    int mo124077c(C84241i iVar);

    /* renamed from: c */
    void mo124078c();

    /* renamed from: d */
    int mo124079d(C84241i iVar);

    /* renamed from: d */
    void mo124080d();

    /* renamed from: e */
    long mo124081e(C84241i iVar);

    /* renamed from: e */
    AbstractC80915g mo124082e();

    /* renamed from: f */
    String mo124083f();

    /* renamed from: f */
    boolean mo124084f(C84241i iVar);

    /* renamed from: g */
    boolean mo124085g();

    /* renamed from: g */
    boolean mo124086g(C84241i iVar);

    /* renamed from: h */
    void mo124088h(C84241i iVar);

    /* renamed from: i */
    void mo124089i(C84241i iVar);

    /* renamed from: j */
    C80923m mo124090j(C84241i iVar);

    /* renamed from: k */
    List<C84227x> mo124091k(C84241i iVar);

    /* renamed from: l */
    List<C84224v> mo124092l(C84241i iVar);

    /* renamed from: m */
    C84224v mo124093m(C84241i iVar);

    /* renamed from: com.ss.android.ugc.aweme.video.preload.i$a */
    public enum EnumC80919a {
        VideoCache("com.ss.android.ugc.aweme.video.preload.VideoCachePreloader", "cache"),
        MediaLoader("com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader", "cachev2");
        

        /* renamed from: a */
        String f180915a;

        /* renamed from: b */
        String f180916b;

        public final String getCacheDirName() {
            return this.f180916b;
        }

        public final String getType() {
            return this.f180915a;
        }

        static {
            Covode.recordClassIndex(94218);
        }

        private EnumC80919a(String str, String str2) {
            this.f180915a = str;
            this.f180916b = str2;
        }
    }
}
