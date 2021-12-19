package com.p2082ss.android.ugc.aweme.poi_api.service;

import android.content.Context;
import android.view.View;
import androidx.core.p036g.C0692e;
import com.bytedance.bpea.basics.AbstractC13343d;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23039d;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41268ae;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.poi.GuitarBundle;
import com.p2082ss.android.ugc.aweme.poi.PoiData;
import com.p2082ss.android.ugc.aweme.poi.PokerBundle;
import com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import java.util.HashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89188r;

/* renamed from: com.ss.android.ugc.aweme.poi_api.service.IPoiService */
public interface IPoiService {
    static {
        Covode.recordClassIndex(74342);
    }

    /* renamed from: a */
    View mo101445a(Context context, Aweme aweme, String str);

    /* renamed from: a */
    C23039d mo101446a(Context context, AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2, AbstractC89171a<C89391z> aVar3);

    /* renamed from: a */
    GuitarBundle mo101447a(Context context, String str, long j, AbstractC13343d dVar);

    /* renamed from: a */
    PoiData mo101448a(AbstractC89172b<? super Class<? extends Object>, ? extends Object> bVar);

    /* renamed from: a */
    PokerBundle mo101449a(String str, double d, double d2);

    /* renamed from: a */
    AbstractC63132a mo101450a();

    /* renamed from: a */
    Map<String, String> mo101451a(String str, Aweme aweme);

    /* renamed from: a */
    void mo101452a(Context context);

    /* renamed from: a */
    void mo101453a(AbstractC13343d dVar);

    /* renamed from: a */
    void mo101454a(String str);

    /* renamed from: a */
    void mo101455a(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7);

    /* renamed from: a */
    void mo101456a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, String str10);

    /* renamed from: a */
    void mo101457a(String str, boolean z, AbstractC89188r<? super Double, ? super Double, ? super String, ? super Boolean, C89391z> rVar, AbstractC89172b<? super Boolean, C89391z> bVar);

    /* renamed from: b */
    C0692e<Class<?>, IAVPublishExtension<?>> mo101458b();

    /* renamed from: b */
    boolean mo101459b(Context context);

    /* renamed from: c */
    void mo101460c();

    /* renamed from: c */
    boolean mo101461c(Context context);

    /* renamed from: d */
    String mo101462d();

    /* renamed from: e */
    boolean mo101463e();

    /* renamed from: f */
    void mo101464f();

    /* renamed from: g */
    void mo101465g();

    /* renamed from: h */
    Map<String, Object> mo101466h();

    /* renamed from: i */
    String mo101467i();

    /* renamed from: j */
    String mo101468j();

    /* renamed from: k */
    String mo101469k();

    /* renamed from: l */
    void mo101470l();

    /* renamed from: m */
    HashMap<String, AbstractC41268ae> mo101471m();
}
