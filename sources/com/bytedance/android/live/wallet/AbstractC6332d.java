package com.bytedance.android.live.wallet;

import android.app.Activity;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.C6380c;
import com.bytedance.android.live.wallet.model.C6384g;
import com.bytedance.android.livesdk.wallet.C11314c;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11634a;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11636c;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.bytedance.android.live.wallet.d */
public interface AbstractC6332d extends AbstractC2953a {
    static {
        Covode.recordClassIndex(7054);
    }

    /* renamed from: a */
    AbstractC88979t<Long> mo12364a();

    /* renamed from: a */
    AbstractC88979t<C5827a<C11314c, DiamondPackageExtra>> mo12365a(String str, long j, long j2, long j3);

    /* renamed from: a */
    void mo12366a(long j);

    /* renamed from: a */
    void mo12367a(AbstractC6360g gVar);

    /* renamed from: a */
    void mo12368a(C6380c cVar, AbstractC11634a aVar);

    /* renamed from: a */
    void mo12369a(C11314c cVar, Activity activity);

    /* renamed from: a */
    void mo12370a(AbstractC11636c cVar);

    /* renamed from: a */
    void mo12371a(String str);

    /* renamed from: a */
    void mo12372a(List<String> list);

    /* renamed from: b */
    long mo12373b();

    /* renamed from: b */
    void mo12374b(AbstractC6360g gVar);

    /* renamed from: b */
    boolean mo12375b(long j);

    /* renamed from: c */
    String mo12376c(long j);

    /* renamed from: c */
    void mo12377c();

    /* renamed from: d */
    String mo12378d(long j);

    /* renamed from: d */
    void mo12379d();

    /* renamed from: e */
    BalanceStruct mo12380e();

    /* renamed from: e */
    void mo12381e(long j);

    /* renamed from: f */
    C6384g mo12382f();

    /* renamed from: g */
    boolean mo12383g();

    /* renamed from: h */
    void mo12384h();
}
