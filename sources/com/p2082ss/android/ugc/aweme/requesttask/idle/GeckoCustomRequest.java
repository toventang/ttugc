package com.p2082ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.C14930f;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.policy.p1032v4.C15001a;
import com.bytedance.geckox.policy.p1032v4.UpdateModel;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.GeckoCustomRequest */
public class GeckoCustomRequest implements AbstractC58264w {

    /* renamed from: a */
    private final List<String> f150599a = Collections.singletonList(CheckRequestBodyModel.GroupType.NORMAL.getValue());

    /* renamed from: b */
    private long f150600b = 0;

    static {
        Covode.recordClassIndex(78794);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: c */
    private long m119010c() {
        long j = this.f150600b;
        if (j != 0) {
            return j;
        }
        Context a = C17867d.m33078a();
        try {
            long j2 = a.getPackageManager().getPackageInfo(a.getPackageName(), 0).firstInstallTime;
            this.f150600b = j2;
            return j2;
        } catch (Exception unused) {
            return this.f150600b;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        boolean z;
        if (System.currentTimeMillis() - m119010c() <= TimeUnit.DAYS.toMillis(7)) {
            z = true;
        } else {
            z = false;
        }
        if (C49907s.m93685a().booleanValue() || z) {
            C14930f.m27473a();
            String c = C81631k.f182525a.mo125297c();
            List<String> list = this.f150599a;
            if (!TextUtils.isEmpty("occasion_normal") && !TextUtils.isEmpty(c)) {
                if (list != null && !list.isEmpty()) {
                    if (C15001a.f36646b == null) {
                        C15001a.f36646b = new ConcurrentHashMap();
                    }
                    C14957a.m27543a("register group update occasion:".concat("occasion_normal"), c, list);
                    Map<String, UpdateModel> map = C15001a.f36646b.get("occasion_normal");
                    if (map == null) {
                        Hashtable hashtable = new Hashtable();
                        hashtable.put(c, new UpdateModel(new CopyOnWriteArrayList(list), null));
                        C15001a.f36646b.put("occasion_normal", hashtable);
                    } else {
                        UpdateModel updateModel = map.get(c);
                        if (updateModel == null) {
                            map.put(c, new UpdateModel(new CopyOnWriteArrayList(list), null));
                        } else if (!(updateModel.getGroups() == null && updateModel.getChannels() == null)) {
                            if (updateModel.getGroups() == null) {
                                updateModel.setGroups(new CopyOnWriteArrayList(list));
                            } else {
                                updateModel.getGroups().addAll(list);
                            }
                        }
                    }
                } else if (!TextUtils.isEmpty("occasion_normal") && !TextUtils.isEmpty(c)) {
                    if (C15001a.f36646b == null) {
                        C15001a.f36646b = new ConcurrentHashMap();
                    }
                    C14957a.m27543a("register accessKey update occasion:".concat("occasion_normal"), c);
                    Map<String, UpdateModel> map2 = C15001a.f36646b.get("occasion_normal");
                    if (map2 == null) {
                        Hashtable hashtable2 = new Hashtable();
                        hashtable2.put(c, new UpdateModel());
                        C15001a.f36646b.put("occasion_normal", hashtable2);
                    } else {
                        map2.put(c, new UpdateModel());
                    }
                }
            }
            C17873f.m33099g().mo143062b(new AbstractC88986z<Boolean>() {
                /* class com.p2082ss.android.ugc.aweme.requesttask.idle.GeckoCustomRequest.C671831 */

                static {
                    Covode.recordClassIndex(78795);
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onComplete() {
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onError(Throwable th) {
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onSubscribe(AbstractC88412b bVar) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.AbstractC88986z
                public final /* synthetic */ void onNext(Boolean bool) {
                    List<GlobalConfigSettings.SyncItem> list;
                    if (bool.booleanValue()) {
                        C14930f a = C14930f.m27473a();
                        if (a.f36480f != null) {
                            C15001a aVar = a.f36480f;
                            if (!TextUtils.isEmpty("occasion_normal") && aVar.f36648c != null && !aVar.f36648c.isEmpty() && (list = aVar.f36648c.get("occasion_normal")) != null && !list.isEmpty()) {
                                C14957a.m27543a("registered occasion is triggered:".concat("occasion_normal"), list);
                                aVar.mo24235a(7, list, null);
                            }
                        }
                    }
                }
            });
        }
    }
}
