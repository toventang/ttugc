package com.p2082ss.android.ugc.aweme.p2282ad.feed.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38231b;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38233d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.dialog.DislikeReasonApi;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.dialog.b */
public final class View$OnClickListenerC33248b extends DialogInterface$OnCancelListenerC0944d implements View.OnClickListener {

    /* renamed from: g */
    public static final C33249a f78989g = new C33249a((byte) 0);

    /* renamed from: a */
    boolean f78990a = true;

    /* renamed from: b */
    final C88411a f78991b;

    /* renamed from: c */
    final AwemeRawAd f78992c;

    /* renamed from: d */
    final String f78993d;

    /* renamed from: e */
    final AbstractC33251c f78994e;

    /* renamed from: f */
    final Long f78995f;

    /* renamed from: h */
    private final List<C38233d> f78996h;

    /* renamed from: i */
    private HashMap f78997i;

    static {
        Covode.recordClassIndex(40074);
    }

    /* renamed from: a */
    private View m68173a(int i) {
        if (this.f78997i == null) {
            this.f78997i = new HashMap();
        }
        View view = (View) this.f78997i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f78997i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.dialog.b$a */
    public static final class C33249a {
        static {
            Covode.recordClassIndex(40075);
        }

        private C33249a() {
        }

        public /* synthetic */ C33249a(byte b) {
            this();
        }

        /* renamed from: a */
        public static View$OnClickListenerC33248b m68174a(AwemeRawAd awemeRawAd, String str, AbstractC33251c cVar, Long l) {
            C89219l.m154721d(cVar, "");
            return new View$OnClickListenerC33248b(awemeRawAd, str, cVar, l);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f78991b.dispose();
        HashMap hashMap = this.f78997i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.fg);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (view != null && view.getId() == R.id.bu5) {
            this.f78990a = false;
            dismiss();
            this.f78994e.mo58887a();
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                C89219l.m154716b(activity, "");
                new C23144b(activity).mo37640e(R.string.b8r).mo37637b();
            }
            C39162r.onEventV3("cancel_subcategory");
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f78990a) {
            this.f78994e.mo58887a();
            C39162r.onEventV3("cancel_subcategory");
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                C89219l.m154716b(activity, "");
                new C23144b(activity).mo37640e(R.string.b8r).mo37637b();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C33245a aVar;
        Window window;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setGravity(80);
            window.setLayout(-1, -2);
        }
        RecyclerView recyclerView = (RecyclerView) m68173a(R.id.do6);
        C89219l.m154716b(recyclerView, "");
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) m68173a(R.id.do6);
        C89219l.m154716b(recyclerView2, "");
        List<C38233d> list = this.f78996h;
        if (list != null) {
            aVar = new C33245a(list, new C33250b(this));
        } else {
            aVar = null;
        }
        recyclerView2.setAdapter(aVar);
        RecyclerView recyclerView3 = (RecyclerView) m68173a(R.id.do6);
        C89219l.m154716b(recyclerView3, "");
        recyclerView3.setOverScrollMode(2);
        ((TuxIconView) m68173a(R.id.bu5)).setOnClickListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.x5, viewGroup, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.dialog.b$b */
    static final /* synthetic */ class C33250b extends C89217j implements AbstractC89187q<String, String, Integer, C89391z> {
        static {
            Covode.recordClassIndex(40076);
        }

        C33250b(View$OnClickListenerC33248b bVar) {
            super(3, bVar, View$OnClickListenerC33248b.class, "onViewHolderClick", "onViewHolderClick(Ljava/lang/String;Ljava/lang/String;I)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(String str, String str2, Integer num) {
            String str3;
            String str4;
            String logExtra;
            Long creativeId;
            Long adId;
            String str5 = str;
            int intValue = num.intValue();
            String str6 = "";
            C89219l.m154721d(str5, str6);
            C89219l.m154721d(str2, str6);
            View$OnClickListenerC33248b bVar = (View$OnClickListenerC33248b) this.receiver;
            bVar.f78990a = false;
            bVar.dismiss();
            bVar.f78994e.mo58887a();
            ActivityC0945e activity = bVar.getActivity();
            if (activity != null) {
                C89219l.m154716b(activity, str6);
                new C23144b(activity).mo37635a(str5).mo37637b();
            }
            C39162r.m79460a("dislike_subcategory", new C33744d().mo59980a("option_id", intValue).f79943a);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reasons", str2);
            C88411a aVar = bVar.f78991b;
            Object a = RetrofitFactory.m33635a().mo28817b(DislikeReasonApi.C33244a.f78983a).mo28832d().mo28858a(DislikeReasonApi.class);
            C89219l.m154716b(a, str6);
            DislikeReasonApi dislikeReasonApi = (DislikeReasonApi) a;
            String str7 = bVar.f78993d;
            if (str7 == null) {
                str7 = str6;
            }
            AwemeRawAd awemeRawAd = bVar.f78992c;
            if (awemeRawAd == null || (adId = awemeRawAd.getAdId()) == null || (str3 = String.valueOf(adId.longValue())) == null) {
                str3 = str6;
            }
            AwemeRawAd awemeRawAd2 = bVar.f78992c;
            if (awemeRawAd2 == null || (creativeId = awemeRawAd2.getCreativeId()) == null || (str4 = String.valueOf(creativeId.longValue())) == null) {
                str4 = str6;
            }
            String jSONObject2 = jSONObject.toString();
            C89219l.m154716b(jSONObject2, str6);
            AwemeRawAd awemeRawAd3 = bVar.f78992c;
            if (!(awemeRawAd3 == null || (logExtra = awemeRawAd3.getLogExtra()) == null)) {
                str6 = logExtra;
            }
            aVar.mo142945a(dislikeReasonApi.submitReason(str7, str3, str4, jSONObject2, str6, String.valueOf(bVar.f78995f)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143300g());
            return C89391z.f203057a;
        }
    }

    public View$OnClickListenerC33248b(AwemeRawAd awemeRawAd, String str, AbstractC33251c cVar, Long l) {
        List<C38233d> list;
        C38231b dislikeInfo;
        C89219l.m154721d(cVar, "");
        this.f78992c = awemeRawAd;
        this.f78993d = str;
        this.f78994e = cVar;
        this.f78995f = l;
        if (awemeRawAd == null || (dislikeInfo = awemeRawAd.getDislikeInfo()) == null) {
            list = null;
        } else {
            list = dislikeInfo.getCategoryList();
        }
        this.f78996h = list;
        this.f78991b = new C88411a();
    }
}
