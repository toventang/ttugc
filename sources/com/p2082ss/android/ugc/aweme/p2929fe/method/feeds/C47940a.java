package com.p2082ss.android.ugc.aweme.p2929fe.method.feeds;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.api.AbstractC47950a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.api.IDynamicApi;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.p2933b.C47953a;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a */
public final class C47940a extends AbstractC39100a<Aweme, C47953a> {

    /* renamed from: f */
    public static final C47941a f111046f = new C47941a((byte) 0);

    /* renamed from: a */
    public final C88411a f111047a;

    /* renamed from: b */
    public Activity f111048b;

    /* renamed from: c */
    public int f111049c;

    /* renamed from: d */
    public final String f111050d;

    /* renamed from: e */
    public final AbstractC47950a f111051e;

    /* renamed from: g */
    private String f111052g;

    /* renamed from: h */
    private int f111053h;

    static {
        Covode.recordClassIndex(56648);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a$a */
    public static final class C47941a {
        static {
            Covode.recordClassIndex(56649);
        }

        private C47941a() {
        }

        public /* synthetic */ C47941a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C47940a m90937a(C47953a aVar, String str, AbstractC47950a aVar2) {
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(aVar2, "");
            return new C47940a(aVar, str, aVar2, (byte) 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Aweme> getItems() {
        return ((C47953a) this.mData).f111066a;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null || !((C47953a) this.mData).f111067b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo79953a(Activity activity) {
        if (activity != null) {
            activity.findViewById(16908290).setTag(R.id.w0, this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (objArr.length == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        m90933a(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        m90933a(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a$c */
    static final class C47943c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C47940a f111056a;

        static {
            Covode.recordClassIndex(56651);
        }

        C47943c(C47940a aVar) {
            this.f111056a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC47950a aVar = this.f111056a.f111051e;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eventName", "feeds_status_failed");
            aVar.mo61900b("notification", jSONObject);
            this.f111056a.mIsLoading = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a$e */
    public static final class C47945e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C47940a f111058a;

        static {
            Covode.recordClassIndex(56653);
        }

        C47945e(C47940a aVar) {
            this.f111058a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            this.f111058a.mIsLoading = false;
            List list = this.f111058a.mNotifyListeners;
            if (list != null) {
                for (T t : list) {
                    if (t != null) {
                        if (!(th2 instanceof Exception)) {
                            th = null;
                        } else {
                            th = th2;
                        }
                        t.mo57526a_((Exception) th);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void handleData(C47953a aVar) {
        boolean z = true;
        this.f111049c++;
        if (aVar != null) {
            this.mIsNewDataEmpty = aVar.f111066a.isEmpty();
            ((C47953a) this.mData).f111067b = aVar.f111067b;
            ((C47953a) this.mData).f111066a.addAll(aVar.f111066a);
            C47953a aVar2 = (C47953a) this.mData;
            if (aVar.f111066a.size() <= 0) {
                z = false;
            }
            aVar2.f111067b = z;
            ((C47953a) this.mData).f111068c = aVar.f111068c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a$b */
    static final class C47942b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C47940a f111054a;

        /* renamed from: b */
        final /* synthetic */ Activity f111055b;

        static {
            Covode.recordClassIndex(56650);
        }

        C47942b(C47940a aVar, Activity activity) {
            this.f111054a = aVar;
            this.f111055b = activity;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C47953a aVar = (C47953a) obj;
            AbstractC47950a aVar2 = this.f111054a.f111051e;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("react_id", this.f111054a.f111050d);
            jSONObject2.put("page", this.f111054a.f111049c);
            jSONObject2.put("has_more", aVar.f111067b);
            jSONObject2.put("exist_list_raw", C80342dg.m139300a().mo46674b(aVar.f111066a));
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "feeds_status_change");
            jSONObject.put("eventType", 0);
            aVar2.mo61900b("notification", jSONObject);
            this.f111054a.handleData(aVar);
            this.f111054a.mo79953a(this.f111055b);
            this.f111054a.mIsLoading = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a$d */
    public static final class C47944d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C47940a f111057a;

        static {
            Covode.recordClassIndex(56652);
        }

        C47944d(C47940a aVar) {
            this.f111057a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C47953a aVar = (C47953a) obj;
            AbstractC47950a aVar2 = this.f111057a.f111051e;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("react_id", this.f111057a.f111050d);
            jSONObject2.put("page", this.f111057a.f111049c);
            jSONObject2.put("has_more", aVar.f111067b);
            jSONObject2.put("exist_list_raw", C80342dg.m139300a().mo46674b(aVar.f111066a));
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "feeds_status_change");
            jSONObject.put("eventType", 1);
            aVar2.mo61900b("notification", jSONObject);
            this.f111057a.handleData(aVar);
            C47940a aVar3 = this.f111057a;
            aVar3.mo79953a(aVar3.f111048b);
            this.f111057a.mIsLoading = false;
            List list = this.f111057a.mNotifyListeners;
            if (list != null) {
                for (T t : list) {
                    if (t != null) {
                        t.mo57528c();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m90933a(boolean z) {
        int i;
        this.mIsLoading = true;
        C88411a aVar = this.f111047a;
        String str = this.f111052g;
        if (str == null) {
            C89219l.m154710a("requestUrl");
        }
        IDynamicApi a = IDynamicApi.C47949a.m90938a(str);
        String str2 = this.f111052g;
        if (str2 == null) {
            C89219l.m154710a("requestUrl");
        }
        HashMap hashMap = new HashMap();
        if (z) {
            i = 0;
        } else {
            i = this.f111049c;
        }
        hashMap.put("page", String.valueOf(i));
        hashMap.put("size", String.valueOf(this.f111053h));
        aVar.mo142945a(a.loadVideos(str2, hashMap).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C47944d(this), new C47945e(this)));
    }

    private C47940a(C47953a aVar, String str, AbstractC47950a aVar2) {
        this.f111050d = str;
        this.f111051e = aVar2;
        this.mData = aVar;
        this.f111047a = new C88411a();
        this.f111053h = 20;
    }

    public /* synthetic */ C47940a(C47953a aVar, String str, AbstractC47950a aVar2, byte b) {
        this(aVar, str, aVar2);
    }

    /* renamed from: a */
    public final void mo79955a(String str, int i, int i2, Activity activity) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(activity, "");
        this.f111052g = str;
        this.f111049c = i;
        this.f111053h = i2;
        this.f111048b = activity;
        C88411a aVar = this.f111047a;
        IDynamicApi a = IDynamicApi.C47949a.m90938a(str);
        HashMap hashMap = new HashMap();
        hashMap.put("page", String.valueOf(i));
        hashMap.put("size", String.valueOf(i2));
        aVar.mo142945a(a.loadVideos(str, hashMap).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C47942b(this, activity), new C47943c(this)));
    }
}
