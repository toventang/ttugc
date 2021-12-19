package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.aweme.ttsetting.AbstractC18168b;
import com.bytedance.ies.ugc.aweme.ttsetting.C18161a;
import com.bytedance.ies.ugc.aweme.ttsetting.FetchTTSettingTask;
import com.p2082ss.android.newmedia.C30147h;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58195d;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2729dd.C40958a;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3741d.AbstractC68791a;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3741d.C68799d;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.BaseInitServiceSettingTask */
public class BaseInitServiceSettingTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68420);
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
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.BaseInitServiceSettingTask$a */
    public static final class C58324a implements AbstractC18168b {

        /* renamed from: a */
        final /* synthetic */ BaseInitServiceSettingTask f132819a;

        static {
            Covode.recordClassIndex(68421);
        }

        @Override // com.bytedance.ies.ugc.aweme.ttsetting.AbstractC18168b
        /* renamed from: a */
        public final void mo28951a(Throwable th) {
            C89219l.m154721d(th, "");
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.BaseInitServiceSettingTask$a$a */
        static final class CallableC58325a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C58324a f132820a;

            /* renamed from: b */
            final /* synthetic */ JSONObject f132821b;

            static {
                Covode.recordClassIndex(68422);
            }

            CallableC58325a(C58324a aVar, JSONObject jSONObject) {
                this.f132820a = aVar;
                this.f132821b = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                C40958a aVar;
                if (!C58195d.m105113f() && (aVar = C40958a.f95791a) != null) {
                    aVar.mo70142a(this.f132821b);
                }
                this.f132820a.f132819a.mo95741a(this.f132821b);
                return C89391z.f203057a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58324a(BaseInitServiceSettingTask baseInitServiceSettingTask) {
            this.f132819a = baseInitServiceSettingTask;
        }

        @Override // com.bytedance.ies.ugc.aweme.ttsetting.AbstractC18168b
        /* renamed from: a */
        public final void mo28952a(JSONObject jSONObject) {
            C40958a aVar;
            if (C16048b.m29633a().mo25421a(true, "is_async_setting", true)) {
                C1731i.m5640b(new CallableC58325a(this, jSONObject), C40780g.m82241a());
                return;
            }
            if (!C58195d.m105113f() && (aVar = C40958a.f95791a) != null) {
                aVar.mo70142a(jSONObject);
            }
            this.f132819a.mo95741a(jSONObject);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C89219l.m154721d(context, "");
        C58221f.C58224c cVar = new C58221f.C58224c();
        String str = Api.f79771d;
        C89219l.m154716b(str, "");
        cVar.mo95703b((AbstractC58264w) new FetchTTSettingTask(str)).mo95706a();
        C18161a.m33802a(new C58324a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo95741a(JSONObject jSONObject) {
        AbstractC68791a aVar;
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("aweme_uniqueid_settings");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("user_badge_click_settings");
            if (!(optJSONObject2 == null || TextUtils.isEmpty(optJSONObject2.toString()) || (aVar = (AbstractC68791a) C68799d.f153874a.getValue()) == null)) {
                aVar.mo60939a(optJSONObject2.toString());
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("aweme_music_ailab");
            IExternalService a = AVExternalServiceImpl.m113114a();
            if (optJSONObject3 != null) {
                a.initService().initTask(2, optJSONObject3.toString());
            } else {
                a.initService().initTask(2, "");
            }
            if (optJSONObject != null) {
                boolean z = true;
                if (optJSONObject.optInt("enable_push_deduplication", 1) <= 0) {
                    z = false;
                }
                C30147h.f71913a = z;
            }
        }
    }
}
