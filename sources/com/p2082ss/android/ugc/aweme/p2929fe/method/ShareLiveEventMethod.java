package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.feed.model.LiveEvent;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.ShareServiceImpl;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80627s;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ShareLiveEventMethod */
public final class ShareLiveEventMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47891a f110923a = new C47891a((byte) 0);

    static {
        Covode.recordClassIndex(56577);
    }

    private ShareLiveEventMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShareLiveEventMethod$a */
    public static final class C47891a {
        static {
            Covode.recordClassIndex(56578);
        }

        private C47891a() {
        }

        public /* synthetic */ C47891a(byte b) {
            this();
        }
    }

    private /* synthetic */ ShareLiveEventMethod() {
        this((C18288a) null);
    }

    public ShareLiveEventMethod(C18288a aVar) {
        super(aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShareLiveEventMethod$b */
    public static final class C47892b implements AbstractC69690f {

        /* renamed from: a */
        final /* synthetic */ JSONObject f110924a;

        /* renamed from: b */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f110925b;

        static {
            Covode.recordClassIndex(56579);
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69660b
        /* renamed from: a */
        public final void mo60844a(AbstractC69581b bVar, boolean z, SharePackage sharePackage, Context context) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(context, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
        /* renamed from: a */
        public final void mo60846a(AbstractC69693h hVar, SharePackage sharePackage, Context context) {
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(sharePackage, "");
            C89219l.m154721d(context, "");
        }

        C47892b(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
            this.f110924a = jSONObject;
            this.f110925b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
        /* renamed from: a */
        public final void mo60845a(SharePackage sharePackage, Context context) {
            C89219l.m154721d(sharePackage, "");
            C89219l.m154721d(context, "");
            BaseCommonJavaMethod.AbstractC47813a aVar = this.f110925b;
            if (aVar != null) {
                aVar.mo79888a(this.f110924a);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
        /* renamed from: b */
        public final void mo60847b(SharePackage sharePackage, Context context) {
            C89219l.m154721d(sharePackage, "");
            C89219l.m154721d(context, "");
            try {
                JSONObject jSONObject = this.f110924a;
                if (jSONObject != null) {
                    jSONObject.put("code", 0);
                }
            } catch (JSONException unused) {
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        JSONObject jSONObject2 = new JSONObject();
        int i = 1;
        jSONObject2.put("code", 1);
        WeakReference weakReference = this.mContextRef;
        C89219l.m154716b(weakReference, "");
        C18288a aVar2 = this.mJsBridge;
        boolean z = false;
        if (jSONObject != null) {
            LiveEvent liveEvent = new LiveEvent();
            liveEvent.setShowsIMForActivity(Boolean.valueOf(jSONObject.optBoolean("showsIMForActivity")));
            liveEvent.setEventID(jSONObject.optString("id"));
            liveEvent.setOrganizer((User) GsonHolder.m138942a().mo46682b().mo46670a(jSONObject.optString("organizer"), User.class));
            liveEvent.setTitle(jSONObject.optString("title"));
            liveEvent.setStartTime(jSONObject.optString("start_time"));
            liveEvent.setInternalURL(jSONObject.optString("internalURL"));
            liveEvent.setTrackInfo(jSONObject.optString("track_info"));
            liveEvent.setShareURL(jSONObject.optString("shareURL"));
            liveEvent.setAnchor(jSONObject.optString("isAuthor"));
            liveEvent.setCustomActionItems(C80627s.m139794a(jSONObject.optJSONArray("customActionItems")));
            Context context = (Context) weakReference.get();
            if (!TextUtils.isEmpty(liveEvent.getEventID()) && context != null) {
                C47892b bVar = new C47892b(jSONObject2, aVar);
                jSONObject2.put("tricky_flag", "tricky_flag");
                Activity a = C34729o.m70950a(context);
                if (a != null) {
                    ShareServiceImpl.m121448d().mo109402a(a, liveEvent, bVar, aVar2);
                    z = true;
                }
            }
        }
        if (!jSONObject2.has("tricky_flag")) {
            if (!z) {
                i = -1;
            }
            jSONObject2.put("code", i);
            if (aVar != null) {
                aVar.mo79888a(jSONObject2);
            }
        }
    }
}
