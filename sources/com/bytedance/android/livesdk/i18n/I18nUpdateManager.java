package com.bytedance.android.livesdk.i18n;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* access modifiers changed from: package-private */
public final class I18nUpdateManager {

    /* renamed from: i */
    private static long[] f22086i = {3000, 6000, 9000, 60000, 60000, 60000, 600000};

    /* renamed from: j */
    private static I18nApi f22087j = ((I18nApi) C5805e.m12718a().mo11572a(I18nApi.class));

    /* renamed from: a */
    public String f22088a;

    /* renamed from: b */
    Handler f22089b;

    /* renamed from: c */
    public AbstractC8981a f22090c;

    /* renamed from: d */
    public boolean f22091d;

    /* renamed from: e */
    public int f22092e;

    /* renamed from: f */
    public long f22093f;

    /* renamed from: g */
    public long f22094g;

    /* renamed from: h */
    AbstractC88412b f22095h = null;

    /* renamed from: k */
    private Handler.Callback f22096k = new Handler.Callback() {
        /* class com.bytedance.android.livesdk.i18n.I18nUpdateManager.C89771 */

        static {
            Covode.recordClassIndex(9871);
        }

        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            I18nUpdateManager i18nUpdateManager = I18nUpdateManager.this;
            i18nUpdateManager.mo15214a(i18nUpdateManager.f22094g);
            return true;
        }
    };

    public interface I18nApi {
        static {
            Covode.recordClassIndex(9875);
        }

        @AbstractC22000h(mo35789a = "/webcast/setting/i18n/package/")
        AbstractC88979t<C5832d<C8982a>> update(@AbstractC22018z(mo35807a = "locale") String str, @AbstractC22018z(mo35807a = "cur_version") long j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.i18n.I18nUpdateManager$a */
    public interface AbstractC8981a {
        static {
            Covode.recordClassIndex(9876);
        }

        /* renamed from: a */
        void mo15218a(String str, long j, Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(9870);
    }

    /* renamed from: a */
    public final void mo15215a(Throwable th) {
        long j;
        C3854a.m9453a(6, "i18n_translation", "update on error: " + th.toString());
        int i = this.f22092e + 1;
        this.f22092e = i;
        Handler handler = this.f22089b;
        long[] jArr = f22086i;
        int length = jArr.length;
        if (i >= length || i < 0) {
            j = jArr[length - 1];
        } else {
            j = jArr[i];
        }
        handler.sendEmptyMessageDelayed(0, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15214a(long j) {
        C3854a.m9453a(3, "i18n_translation", "update is called, current version is ".concat(String.valueOf(j)));
        if (!this.f22091d && !this.f22089b.hasMessages(0)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.f22093f;
            if (elapsedRealtime <= j2 || elapsedRealtime - j2 >= 60000) {
                this.f22094g = j;
                this.f22091d = true;
                try {
                    this.f22095h = f22087j.update(this.f22088a, j).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143255a(new AbstractC88433f<C5832d<C8982a>>() {
                        /* class com.bytedance.android.livesdk.i18n.I18nUpdateManager.C89782 */

                        static {
                            Covode.recordClassIndex(9872);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4560f.p4561a.p4567d.AbstractC88433f
                        public final /* synthetic */ void accept(C5832d<C8982a> dVar) {
                            C5832d<C8982a> dVar2 = dVar;
                            I18nUpdateManager.this.f22091d = false;
                            if (dVar2 == null || dVar2.statusCode != 0 || dVar2.data == null) {
                                I18nUpdateManager.this.mo15215a(new Throwable("response == null || response.statusCode != 0 || response.data == null"));
                                return;
                            }
                            C3854a.m9453a(3, "i18n_translation", "update on success");
                            I18nUpdateManager.this.f22092e = 0;
                            I18nUpdateManager.this.f22093f = SystemClock.elapsedRealtime();
                            C8982a aVar = (C8982a) dVar2.data;
                            if (I18nUpdateManager.this.f22090c != null) {
                                I18nUpdateManager.this.f22090c.mo15218a(I18nUpdateManager.this.f22088a, aVar.f22101a, aVar.f22102b);
                            }
                        }
                    }, new AbstractC88433f<Throwable>() {
                        /* class com.bytedance.android.livesdk.i18n.I18nUpdateManager.C89793 */

                        static {
                            Covode.recordClassIndex(9873);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4560f.p4561a.p4567d.AbstractC88433f
                        public final /* synthetic */ void accept(Throwable th) {
                            I18nUpdateManager.this.f22091d = false;
                            I18nUpdateManager.this.mo15215a(th);
                        }
                    }, new AbstractC88428a() {
                        /* class com.bytedance.android.livesdk.i18n.I18nUpdateManager.C89804 */

                        static {
                            Covode.recordClassIndex(9874);
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88428a
                        /* renamed from: a */
                        public final void mo8579a() {
                            I18nUpdateManager.this.f22091d = false;
                        }
                    });
                } catch (Throwable th) {
                    C3854a.m9458a("I18nUpdateManager", th);
                }
            } else {
                C3854a.m9453a(3, "i18n_translation", "in freeze time, quit update");
            }
        } else if (this.f22091d) {
            C3854a.m9453a(3, "i18n_translation", "now is downloading, quit update");
        } else {
            C3854a.m9453a(3, "i18n_translation", "now is waiting for retry, quit update");
        }
    }

    I18nUpdateManager(String str, AbstractC8981a aVar) {
        this.f22088a = str;
        this.f22090c = aVar;
        this.f22089b = new Handler(Looper.getMainLooper(), this.f22096k);
    }
}
