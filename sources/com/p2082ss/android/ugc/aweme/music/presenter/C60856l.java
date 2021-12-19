package com.p2082ss.android.ugc.aweme.music.presenter;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.task.C17827e;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.music.api.MusicDetailApi;
import com.p2082ss.android.ugc.aweme.music.model.MusicDetail;
import com.p2082ss.android.ugc.aweme.music.p3474i.C60808d;
import com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60865q;
import com.p2082ss.android.ugc.aweme.network.p3503a.C61482f;
import com.p2082ss.android.ugc.aweme.utils.C80454fs;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.l */
public class C60856l<V extends AbstractC60865q> extends C39088c<AbstractC39085b<MusicDetail>, V> {

    /* renamed from: a */
    public String f138285a;

    /* renamed from: b */
    public String f138286b;

    /* renamed from: c */
    public Long f138287c = 0L;

    /* renamed from: d */
    public String f138288d = "";

    /* renamed from: e */
    public Long f138289e = 0L;

    static {
        Covode.recordClassIndex(71444);
    }

    public C60856l() {
        mo67838a(new AbstractC39085b<MusicDetail>() {
            /* class com.p2082ss.android.ugc.aweme.music.presenter.C60856l.C608571 */

            static {
                Covode.recordClassIndex(71445);
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean checkParams(Object... objArr) {
                return objArr != null;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean sendRequest(final Object... objArr) {
                boolean z;
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                if (objArr.length > 0 && TextUtils.isEmpty((String) objArr[0])) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        String stackTraceString = Log.getStackTraceString(new Throwable());
                        if (stackTraceString.length() > 1024) {
                            stackTraceString = stackTraceString.substring(0, 1024);
                        }
                        jSONObject.put("error_stack", stackTraceString);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    C34611o.m70668a("music_id_empty", jSONObject);
                }
                if (objArr.length >= 4) {
                    z = ((Boolean) objArr[3]).booleanValue();
                } else {
                    z = false;
                }
                MusicDetail a = C60808d.m110396a((String) objArr[0], objArr[1].toString());
                if (a == null || z) {
                    C34608n.f81665a.mo61083a(this.mHandler, new Callable() {
                        /* class com.p2082ss.android.ugc.aweme.music.presenter.C60856l.C608571.CallableC608581 */

                        static {
                            Covode.recordClassIndex(71446);
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C60856l.this.f138287c = Long.valueOf(SystemClock.elapsedRealtime());
                            C60856l.this.f138285a = (String) objArr[0];
                            if (objArr[1] != null) {
                                C60856l.this.f138286b = objArr[1].toString();
                            }
                            Object[] objArr = objArr;
                            if (objArr.length <= 2 || ((Integer) objArr[2]).intValue() != 1) {
                                Object[] objArr2 = objArr;
                                String str = (String) objArr2[0];
                                int intValue = ((Integer) objArr2[1]).intValue();
                                MusicDetailApi.DetailApi detailApi = MusicDetailApi.f137509a;
                                if (str != null) {
                                    str = str.trim();
                                }
                                return detailApi.queryMusic(str, intValue).get();
                            }
                            Object[] objArr3 = objArr;
                            return MusicDetailApi.f137509a.queryPartnerMusic((String) objArr3[0], (String) objArr3[1]).get();
                        }
                    }, 0);
                } else {
                    handleData(a);
                    C60856l.this.mo57528c();
                }
                return true;
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public void mo57528c() {
        String str;
        if (!(this.f92287i == null || this.f92286h == null)) {
            ((AbstractC60865q) this.f92287i).mo93928a((MusicDetail) this.f92286h.mData);
        }
        String str2 = this.f138285a;
        if (str2 != null && (str = this.f138286b) != null) {
            T t = this.f92286h.mData;
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(t, "");
            C60808d.f138187a.mo2092a(str2 + '&' + str, new C60808d.C60810b(t, System.currentTimeMillis()));
            C80454fs.m139461a(this.f138288d, "MusicDetail", this.f138289e.longValue(), this.f138287c.longValue(), SystemClock.elapsedRealtime(), C61482f.m111327a(), C60859m.f138293a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        if (this.f92287i != null) {
            ((AbstractC60865q) this.f92287i).mo93929a(exc);
        }
        String str = this.f138288d;
        if (str != null) {
            C17827e.m33009a(str);
        }
    }
}
