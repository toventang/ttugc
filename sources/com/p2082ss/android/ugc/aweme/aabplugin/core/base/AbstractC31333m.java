package com.p2082ss.android.ugc.aweme.aabplugin.core.base;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.base.AbstractC17362a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.plugin.p1266b.C18123a;
import com.bytedance.p1542m.p1544b.C21409a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31339n;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.p2230a.C31312a;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.p2230a.C31313b;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.p2230a.C31316c;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.p2230a.C31319f;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity;
import com.p2082ss.android.ugc.aweme.activity.processor.AbstractC33102w;
import com.p2082ss.android.ugc.aweme.activity.processor.C33079f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Timer;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p078c.p080b.C1756d;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.m */
public abstract class AbstractC31333m<T extends AbstractC31339n> {

    /* renamed from: a */
    protected final int f75060a = -1;

    /* renamed from: b */
    protected final int f75061b = 1001;

    /* renamed from: c */
    protected final int f75062c = 8;

    /* renamed from: d */
    public final C31313b f75063d = new C31313b(new C31334a(this));

    /* renamed from: e */
    public final AbstractC31345q f75064e = new C31347s();

    /* renamed from: f */
    protected boolean f75065f;

    /* renamed from: g */
    public volatile T f75066g;

    /* renamed from: h */
    protected volatile int f75067h;

    /* renamed from: i */
    public volatile C21409a f75068i;

    /* renamed from: j */
    public final String f75069j;

    static {
        Covode.recordClassIndex(38033);
    }

    /* renamed from: b */
    public abstract void mo57303b();

    /* renamed from: b */
    public abstract boolean mo57304b(ActivityC17312a aVar);

    /* renamed from: c */
    public abstract void mo57306c();

    /* renamed from: a */
    public void mo57301a() {
        this.f75063d.mo57324a();
        this.f75065f = false;
        this.f75068i = null;
        this.f75066g = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.m$a */
    static final class C31334a implements C31313b.AbstractC31314a {

        /* renamed from: a */
        final /* synthetic */ AbstractC31333m f75070a;

        static {
            Covode.recordClassIndex(38034);
        }

        C31334a(AbstractC31333m mVar) {
            this.f75070a = mVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.aabplugin.core.base.p2230a.C31313b.AbstractC31314a
        /* renamed from: a */
        public final void mo57325a() {
            AbstractC31333m mVar = this.f75070a;
            T t = mVar.f75066g;
            if (t != null) {
                C31316c.m65517a(t, 3, null);
                t.mo57342a(AbstractC31339n.EnumC31342b.TIMEOUT);
                mVar.f75063d.mo57324a();
                C31310a.m65494a();
                C31310a.m65498b(t);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.m$b */
    static final class CallableC31335b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f75071a;

        static {
            Covode.recordClassIndex(38035);
        }

        CallableC31335b(String str) {
            this.f75071a = str;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            Activity validTopActivity = ActivityStack.getValidTopActivity();
            if (validTopActivity == null) {
                return null;
            }
            validTopActivity.getLocalClassName();
            Intent intent = new Intent(validTopActivity, DFInstallBlankActivity.class);
            intent.putExtra("module_name", this.f75071a);
            intent.putExtra("is_hold_permission_dialog", true);
            C84349a.m145093a(intent, validTopActivity);
            validTopActivity.startActivity(intent);
            validTopActivity.overridePendingTransition(0, 0);
            return C89391z.f203057a;
        }
    }

    /* renamed from: d */
    public final void mo57335d() {
        T t = this.f75066g;
        if (t != null) {
            int i = this.f75067h;
            try {
                JSONObject a = C31316c.m65515a(t);
                a.put("status", i);
                C39162r.m79463b("df_cancel_progress_dialog", a);
                C12290b.m22060a("df_cancel_progress_dialog", C31316c.m65514a(i), a);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (t.f75081e != AbstractC31339n.EnumC31342b.RUNNING || !t.f75078b.f43116c) {
                C31310a.m65494a();
                C31310a.m65498b(t);
                return;
            }
            AbstractC31339n.m65543b(t, 8);
            t.mo57338a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.m$c */
    static final class C31336c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC31333m f75072a;

        /* renamed from: b */
        final /* synthetic */ ActivityC17312a f75073b;

        static {
            Covode.recordClassIndex(38036);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31336c(AbstractC31333m mVar, ActivityC17312a aVar) {
            super(1);
            this.f75072a = mVar;
            this.f75073b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(new AbstractC89171a<AbstractC17362a>(this) {
                /* class com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31333m.C31336c.C313371 */

                /* renamed from: a */
                final /* synthetic */ C31336c f75074a;

                static {
                    Covode.recordClassIndex(38037);
                }

                {
                    this.f75074a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ AbstractC17362a invoke() {
                    return new C33079f(new AbstractC33102w(this) {
                        /* class com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31333m.C31336c.C313371.C313381 */

                        /* renamed from: a */
                        final /* synthetic */ C313371 f75075a;

                        static {
                            Covode.recordClassIndex(38038);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f75075a = r1;
                        }

                        @Override // com.p2082ss.android.ugc.aweme.activity.processor.AbstractC33102w
                        /* renamed from: a */
                        public final void mo57337a(int i, int i2, Intent intent) {
                            int i3;
                            if (i == this.f75075a.f75074a.f75072a.f75062c) {
                                this.f75075a.f75074a.f75073b.finish();
                                T t = this.f75075a.f75074a.f75072a.f75066g;
                                if (t != null) {
                                    try {
                                        JSONObject a = C31316c.m65515a(t);
                                        a.put("result_code", i2);
                                        C39162r.m79463b("df_click_permission_dialog", a);
                                        if (i2 == 0) {
                                            i3 = 5;
                                        } else {
                                            i3 = 6;
                                        }
                                        C12290b.m22060a("df_click_permission_dialog", i3, a);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    if (i2 == -1) {
                                        t.mo57342a(AbstractC31339n.EnumC31342b.UNKNOWN);
                                    } else {
                                        C31310a.m65494a();
                                        C31310a.m65498b(t);
                                    }
                                    t.f75078b.f43124k.mo28882a(i2);
                                }
                            }
                        }
                    });
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public void mo57302a(T t) {
        C89219l.m154721d(t, "");
        t.mo57342a(AbstractC31339n.EnumC31342b.UNKNOWN);
        this.f75066g = t;
        this.f75067h = this.f75060a;
        this.f75068i = null;
    }

    public AbstractC31333m(String str) {
        C89219l.m154721d(str, "");
        this.f75069j = str;
    }

    /* renamed from: a */
    public final boolean mo57332a(ActivityC17312a aVar) {
        C89219l.m154721d(aVar, "");
        try {
            aVar.activityConfiguration(new C31336c(this, aVar));
            return mo57304b(aVar);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public final void mo57334b(AbstractC31339n nVar) {
        C89219l.m154721d(nVar, "");
        T t = this.f75066g;
        if (t != null && nVar.f75080d >= t.f75080d) {
            AbstractC31339n.m65543b(t, 10);
            C89219l.m154721d(nVar, "");
            t.f75078b = nVar.f75078b;
            t.f75077a = nVar.f75077a;
            t.f75091o = nVar.f75091o;
        }
        this.f75064e.mo57350a(0, this.f75066g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo57333b(C21409a aVar) {
        boolean z;
        String str;
        long j;
        C89219l.m154721d(aVar, "");
        T t = this.f75066g;
        if (t != null) {
            if (t.f75080d == 0) {
                z = true;
            } else {
                z = false;
            }
            if (aVar.f50790c == 2) {
                long j2 = this.f75063d.f75039d;
                if (j2 > 0) {
                    j = System.currentTimeMillis() - j2;
                } else {
                    j = -1;
                }
                aVar.f50793f = j;
            }
            int i = this.f75067h;
            try {
                JSONObject a = C31316c.m65515a(t);
                a.put("pre_status", i);
                a.put("status", aVar.f50790c);
                a.put("is_silent_install", t.f75077a);
                if (aVar.f50790c == 2) {
                    long j3 = aVar.f50792e;
                    long j4 = aVar.f50791d;
                    a.put("bytes_downloaded", j3);
                    a.put("bytes_to_download", j4);
                    if (j3 == j4) {
                        a.put("download_duration", aVar.f50793f);
                    }
                } else if (aVar.f50790c == 6 || aVar.f50790c == 0) {
                    a.put("error_code", aVar.f50794g);
                    if (aVar.f50796i != null) {
                        str = aVar.f50796i.getMessage();
                    } else {
                        str = "";
                    }
                    a.put("error_msg", str);
                    a.put("available_size", C1756d.m5895b(C17867d.m33078a()));
                    a.put("total_size", C1756d.m5897c(C17867d.m33078a()));
                    a.put("is_external_storage", C31312a.m65511a());
                }
                C39162r.m79463b("df_state_change", a);
                C12290b.m22060a("df_state_change", aVar.f50790c, a);
            } catch (Exception e) {
                e.printStackTrace();
            }
            int i2 = this.f75067h;
            C89219l.m154721d(t, "");
            C89219l.m154721d(aVar, "");
            try {
                JSONObject jSONObject = new JSONObject(t.mo57343c());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject.put("pre_status", i2);
                jSONObject.put("status", aVar.f50790c);
                jSONObject.put("is_silent_install", t.f75077a);
                if (aVar.f50790c == 2) {
                    long j5 = aVar.f50792e;
                    long j6 = aVar.f50791d;
                    jSONObject2.put("bytes_downloaded", j5);
                    jSONObject2.put("bytes_to_download", j6);
                    if (j5 == j6) {
                        jSONObject2.put("download_duration", aVar.f50793f);
                    }
                } else if (aVar.f50790c == 6 || aVar.f50790c == 0) {
                    jSONObject.put("error_code", aVar.f50794g);
                    jSONObject.put("is_external_storage", C31312a.m65511a());
                    jSONObject2.put("available_size", C1756d.m5895b(C17867d.m33078a()));
                    jSONObject2.put("total_size", C1756d.m5897c(C17867d.m33078a()));
                }
                C12290b.m22066a("df_sdk_state_change", jSONObject, jSONObject2, (JSONObject) null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.f75068i = aVar;
            C31310a a2 = C31310a.m65494a();
            switch (aVar.f50790c) {
                case 0:
                    t.mo57342a(AbstractC31339n.EnumC31342b.UNKNOWN);
                    this.f75067h = 0;
                    break;
                case 1:
                    if (this.f75067h != 1) {
                        this.f75064e.mo57350a(0, t);
                    }
                    t.mo57342a(AbstractC31339n.EnumC31342b.PENDING);
                    this.f75067h = 1;
                    break;
                case 2:
                    if (this.f75067h != 2) {
                        C31313b bVar = this.f75063d;
                        long currentTimeMillis = System.currentTimeMillis();
                        bVar.f75039d = currentTimeMillis;
                        bVar.f75038c = currentTimeMillis;
                        if (t.f75078b.f43117d) {
                            C31313b bVar2 = this.f75063d;
                            if (bVar2.f75037b != null) {
                                bVar2.f75037b.cancel();
                            }
                            bVar2.f75037b = new Timer();
                            bVar2.f75037b.schedule(new C31313b.C31315b(), 0, C18123a.f43178c / 10);
                        }
                    }
                    this.f75063d.f75038c = System.currentTimeMillis();
                    t.mo57341a(aVar.f50792e, aVar.f50791d);
                    this.f75064e.mo57350a(1, t);
                    t.mo57342a(AbstractC31339n.EnumC31342b.RUNNING);
                    this.f75067h = 2;
                    break;
                case 3:
                    t.mo57342a(AbstractC31339n.EnumC31342b.DOWNLOADED);
                    this.f75067h = 3;
                    break;
                case 4:
                    if (this.f75067h != 4) {
                        if (t.f75078b.f43117d) {
                            this.f75063d.mo57324a();
                        }
                        this.f75063d.f75038c = System.currentTimeMillis();
                    }
                    t.mo57341a(aVar.f50792e, aVar.f50791d);
                    this.f75064e.mo57350a(2, t);
                    t.mo57342a(AbstractC31339n.EnumC31342b.RUNNING);
                    this.f75067h = 4;
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    if (this.f75067h != 5) {
                        AbstractC31339n.m65541a(t, 0);
                    }
                    t.mo57342a(AbstractC31339n.EnumC31342b.SUCCEEDED);
                    this.f75067h = 5;
                    a2.mo57315a(this.f75069j);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    if (this.f75067h != 6) {
                        if (!t.f75077a) {
                            if (aVar.f50794g == -10) {
                                if (t.f75079c == null || t.f75079c.f43161d == null) {
                                    C31319f.m65521a((int) R.string.fq8);
                                } else {
                                    C31319f.m65522a(t.f75079c.f43161d);
                                }
                            } else if (t.f75079c == null || t.f75079c.f43160c == null) {
                                C31319f.m65521a((int) R.string.c3b);
                            } else {
                                C31319f.m65522a(t.f75079c.f43160c);
                            }
                        }
                        t.mo57339a(aVar.f50794g, z);
                        if (t.f75078b.f43115b) {
                            int i3 = aVar.f50794g;
                            if (i3 != -100) {
                                switch (i3) {
                                    case -15:
                                    case -14:
                                    case -5:
                                    case -2:
                                    case 0:
                                        break;
                                }
                            }
                            long j7 = t.f75078b.f43119f;
                            if (j7 == 0) {
                                a2.mo57320c(t);
                            } else {
                                a2.mo57314a(t, j7);
                            }
                        }
                    }
                    t.mo57342a(AbstractC31339n.EnumC31342b.FAILED);
                    this.f75067h = 6;
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    if (this.f75067h != 7) {
                        if (t.f75081e == AbstractC31339n.EnumC31342b.TIMEOUT) {
                            if (t.f75078b.f43117d && !this.f75065f) {
                                t.mo57342a(AbstractC31339n.EnumC31342b.UNKNOWN);
                                if (a2.mo57321d(t)) {
                                    this.f75065f = true;
                                    return;
                                }
                                a2.mo57314a(t, C18123a.f43176a);
                            }
                            if (!t.f75077a) {
                                if (t.f75079c == null || t.f75079c.f43163f == null) {
                                    C31319f.m65521a((int) R.string.d9x);
                                } else {
                                    C31319f.m65522a(t.f75079c.f43163f);
                                }
                            }
                        } else if (t.f75078b.f43116c) {
                            a2.mo57314a(t, C18123a.f43176a);
                        }
                        t.mo57339a(9, z);
                    }
                    t.mo57342a(AbstractC31339n.EnumC31342b.CANCELED);
                    this.f75067h = 7;
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    t.mo57342a(AbstractC31339n.EnumC31342b.RUNNING);
                    this.f75067h = 8;
                    this.f75063d.mo57324a();
                    if (!t.f75078b.f43114a) {
                        C31310a.m65498b(t);
                        break;
                    } else {
                        C1731i.m5640b(new CallableC31335b(this.f75069j), C1731i.f5564c);
                        return;
                    }
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    t.mo57342a(AbstractC31339n.EnumC31342b.RUNNING);
                    this.f75067h = 9;
                    break;
            }
            if (t.f75081e.isFinished()) {
                this.f75064e.mo57350a(3, t);
                mo57301a();
                C31310a a3 = C31310a.m65494a();
                a3.mo57319c();
                a3.mo57318b();
            }
        }
    }
}
