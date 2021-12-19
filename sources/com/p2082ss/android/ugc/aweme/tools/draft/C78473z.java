package com.p2082ss.android.ugc.aweme.tools.draft;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.uikit.p1281c.C18247a;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.LighteningExtraInfo;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b;
import com.p2082ss.android.ugc.aweme.experiment.C46788ce;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2306ah.C33447a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2698a.C40340a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70788aa;
import com.p2082ss.android.ugc.aweme.tools.C77807b;
import com.p2082ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder;
import com.p2082ss.android.ugc.aweme.tools.draft.p4102c.C78215b;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import com.p2082ss.android.ugc.aweme.tools.draft.p4114l.C78405c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80358dt;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.utils.C80419fb;
import com.p2082ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.p2082ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.p2082ss.android.ugc.gamora.editor.lightening.C82306a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p077b.C1731i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.C89133g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.z */
public final class C78473z extends AbstractC78471x implements AwemeDraftViewHolder.AbstractC78113a {

    /* renamed from: b */
    ButtonTitleBar f176351b;

    /* renamed from: c */
    DmtStatusView f176352c;

    /* renamed from: d */
    RecyclerView f176353d;

    /* renamed from: e */
    TextView f176354e;

    /* renamed from: f */
    public TextView f176355f;

    /* renamed from: g */
    FrameLayout f176356g;

    /* renamed from: h */
    public boolean f176357h;

    /* renamed from: i */
    public AbstractC78375g f176358i;

    /* renamed from: j */
    public Set<C43223c> f176359j = new HashSet();

    /* renamed from: k */
    boolean f176360k;

    /* renamed from: l */
    ObjectAnimator f176361l;

    /* renamed from: m */
    public C78215b f176362m;

    /* renamed from: n */
    public Map<C43223c, List<? extends Effect>> f176363n = new LinkedHashMap();

    /* renamed from: o */
    public C1213t<Boolean> f176364o = new C1213t<>();

    /* renamed from: p */
    public Map<C43223c, Boolean> f176365p = new HashMap();

    /* renamed from: q */
    private View f176366q;

    /* renamed from: r */
    private boolean f176367r;

    /* renamed from: s */
    private Map<ImageView, C24117a<AbstractC24454c>> f176368s = new WeakHashMap();

    /* renamed from: t */
    private ObjectAnimator f176369t;

    /* renamed from: u */
    private long f176370u;

    /* renamed from: v */
    private int f176371v = 0;

    /* renamed from: w */
    private IDraftService.DraftListener f176372w = new IDraftService.DraftListenerAdapter() {
        /* class com.p2082ss.android.ugc.aweme.tools.draft.C78473z.C784741 */

        static {
            Covode.recordClassIndex(91603);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftUpdate(C43223c cVar) {
            if (C78473z.this.f129386a) {
                C78473z.this.f176358i.mo122054b(cVar);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftDelete(C43223c cVar) {
            LighteningExtraInfo lighteningExtraInfo;
            if (cVar != null) {
                C78473z.this.f176358i.mo122050a(cVar.mo73726r());
                if (cVar.mo73734t() && C82306a.m142361c() && (lighteningExtraInfo = cVar.f100900W.f100843bp) != null) {
                    String scheduleId = lighteningExtraInfo.getScheduleId();
                    if (!TextUtils.isEmpty(scheduleId)) {
                        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService().mo93866a(scheduleId);
                    }
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftCheckedChanged(C43223c cVar, boolean z) {
            String string;
            if (z) {
                C78473z.this.f176359j.add(cVar);
            } else {
                C78473z.this.f176359j.remove(cVar);
            }
            C78473z.this.f176354e.setText(C1764a.m5928a(C78473z.this.getString(R.string.ya), new Object[]{Integer.valueOf(C78473z.this.f176359j.size())}));
            if (C78473z.this.f176357h) {
                TextView textView = C78473z.this.f176355f;
                C78473z zVar = C78473z.this;
                long j = 0;
                for (C43223c cVar2 : zVar.f176359j) {
                    j += cVar2.f100880C;
                }
                DecimalFormat decimalFormat = new DecimalFormat();
                decimalFormat.setMaximumFractionDigits(1);
                if (j / 1073741824 > 1) {
                    string = zVar.getString(R.string.fnd, decimalFormat.format((double) ((((float) j) * 1.0f) / 1.07374182E9f)));
                } else {
                    string = zVar.getString(R.string.fnc, decimalFormat.format((double) ((((float) j) * 1.0f) / 1048576.0f)));
                }
                textView.setText(string);
            }
            if (C78473z.this.f176359j.size() <= 0) {
                C78473z.this.mo122399h();
            } else if (C78473z.this.f176356g.getVisibility() != 0) {
                C78473z zVar2 = C78473z.this;
                if (zVar2.f176356g.getVisibility() != 0) {
                    zVar2.f176361l = ObjectAnimator.ofFloat(zVar2.f176356g, "translationY", (float) zVar2.f176356g.getMeasuredHeight(), 0.0f).setDuration(200L);
                    zVar2.f176361l.addListener(new AnimatorListenerAdapter() {
                        /* class com.p2082ss.android.ugc.aweme.tools.draft.C78473z.C784816 */

                        static {
                            Covode.recordClassIndex(91610);
                        }

                        public final void onAnimationStart(Animator animator) {
                            C78473z.this.f176356g.setVisibility(0);
                        }
                    });
                    zVar2.f176361l.start();
                }
            }
        }
    };

    /* renamed from: x */
    private Map<C43223c, List<StickerItemModel>> f176373x;

    /* renamed from: y */
    private boolean f176374y;

    /* renamed from: z */
    private LinearLayoutManager f176375z;

    static {
        Covode.recordClassIndex(91602);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder.AbstractC78113a
    /* renamed from: a */
    public final void mo122029a(View view, C43223c cVar) {
    }

    /* renamed from: n */
    private IDraftService.DraftListener m137015n() {
        return new IDraftService.DraftListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.tools.draft.C78473z.C784805 */

            static {
                Covode.recordClassIndex(91609);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
            public final void onDraftUpdate(C43223c cVar) {
                C78473z.this.mo122394c();
            }
        };
    }

    /* renamed from: k */
    private static boolean m137012k() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: l */
    private void m137013l() {
        this.f176374y = false;
        this.f176352c.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo122394c() {
        this.f176352c.mo27384f();
        C77807b.f174559a.execute(new RunnableC78127ac(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo122400i() {
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: m */
    private String m137014m() {
        if (this.f176357h) {
            return "storage_management";
        }
        if (this.f176371v == 1) {
            return "video_shoot_page";
        }
        return "personal_homepage";
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78471x
    /* renamed from: b */
    public final void mo122087b() {
        m137013l();
        if (this.f176360k) {
            this.f176360k = false;
            mo122399h();
            mo122398g();
            return;
        }
        mo122400i();
    }

    /* renamed from: e */
    public final void mo122396e() {
        if (this.f176374y) {
            m137013l();
            new C79459a(getContext()).mo123050a(R.string.awt).mo123053a();
        }
    }

    /* renamed from: d */
    public final void mo122395d() {
        Map<C43223c, List<StickerItemModel>> map = this.f176373x;
        if (map == null || map.isEmpty()) {
            C80419fb.m139411a(this.f176364o, true);
        } else {
            this.f176362m.mo122121a(this.f176373x, new AbstractC80358dt<Map<C43223c, ? extends List<? extends Effect>>>() {
                /* class com.p2082ss.android.ugc.aweme.tools.draft.C78473z.C784763 */

                static {
                    Covode.recordClassIndex(91605);
                }

                @Override // p4600h.p4603c.AbstractC89124d
                public final AbstractC89127f getContext() {
                    return C89133g.INSTANCE;
                }

                @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80358dt
                /* renamed from: a */
                public final void mo122403a(Throwable th) {
                    C80419fb.m139411a(C78473z.this.f176364o, false);
                    C84911q.m145926b("DraftBoxFragment : refreshDraftList , updateEffect --- resumeWithException : " + C84911q.m145925b(th));
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80358dt
                /* renamed from: a */
                public final /* synthetic */ void mo122402a(Map<C43223c, ? extends List<? extends Effect>> map) {
                    for (Map.Entry<C43223c, ? extends List<? extends Effect>> entry : map.entrySet()) {
                        final C43223c key = entry.getKey();
                        List list = (List) entry.getValue();
                        C89219l.m154721d(list, "");
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : list) {
                            if (!C78215b.m136698a((Effect) obj)) {
                                arrayList2.add(obj);
                            }
                        }
                        arrayList.addAll(arrayList2);
                        C78473z.m137010a(key, list);
                        C78473z.this.f176363n.put(key, arrayList);
                        if (arrayList.isEmpty()) {
                            C78473z.this.f176365p.put(key, true);
                        } else {
                            C78473z.this.f176362m.mo122119a(new C89378p<>(key, arrayList), false, (AbstractC89124d<? super C89378p<? extends C43223c, Boolean>>) new AbstractC80358dt<C89378p<? extends C43223c, ? extends Boolean>>() {
                                /* class com.p2082ss.android.ugc.aweme.tools.draft.C78473z.C784763.C784771 */

                                static {
                                    Covode.recordClassIndex(91606);
                                }

                                @Override // p4600h.p4603c.AbstractC89124d
                                public final AbstractC89127f getContext() {
                                    return C89133g.INSTANCE;
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<com.ss.android.ugc.aweme.draft.model.c, java.lang.Boolean> */
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80358dt
                                /* renamed from: a */
                                public final /* synthetic */ void mo122402a(C89378p<? extends C43223c, ? extends Boolean> pVar) {
                                    C89378p<? extends C43223c, ? extends Boolean> pVar2 = pVar;
                                    C78473z.this.f176365p.put(pVar2.getFirst(), pVar2.getSecond());
                                }

                                @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80358dt
                                /* renamed from: a */
                                public final void mo122403a(Throwable th) {
                                    C84911q.m145926b("DraftBoxFragment : refreshDraftList , downloadEffect --- resumeWithException : " + C84911q.m145925b(th));
                                    C78473z.this.f176365p.put(key, false);
                                }
                            });
                        }
                    }
                    C80419fb.m139411a(C78473z.this.f176364o, true);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo122397f() {
        C70788aa.m125072a(getContext(), getContext().getResources().getQuantityString(R.plurals.b4, this.f176359j.size()), getString(R.string.bc2), new C78132ah(this), getString(R.string.bc3));
    }

    /* renamed from: h */
    public final void mo122399h() {
        this.f176359j.clear();
        if (this.f176356g.getVisibility() != 8) {
            FrameLayout frameLayout = this.f176356g;
            ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout, "translationY", (float) frameLayout.getMeasuredHeight()).setDuration(200L);
            this.f176369t = duration;
            duration.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.tools.draft.C78473z.C784827 */

                static {
                    Covode.recordClassIndex(91611);
                }

                public final void onAnimationEnd(Animator animator) {
                    C78473z.this.f176356g.setVisibility(8);
                }
            });
            this.f176369t.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ C89391z mo122401j() {
        C39162r.m79460a("delete_drafts", new C84425b().mo129406a("enter_method", "batch_select").mo129403a("draft_cnt", this.f176359j.size()).mo129406a("enter_from", m137014m()).f188764a);
        this.f176358i.mo122053b();
        mo122399h();
        this.f176360k = false;
        mo122398g();
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56815c, androidx.fragment.app.Fragment
    public final void onDestroy() {
        for (C24117a<AbstractC24454c> aVar : this.f176368s.values()) {
            aVar.close();
        }
        this.f176368s.clear();
        super.onDestroy();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56814b, com.p2082ss.android.ugc.aweme.p3290j.C56815c, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78471x
    public final void onDestroyView() {
        C78397c.m136927a().unregisterDraftListener(this.f176372w);
        ObjectAnimator objectAnimator = this.f176369t;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f176369t.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f176361l;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
            this.f176361l.cancel();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        AbstractC78375g gVar;
        super.onStart();
        mo122399h();
        if (!C63244g.m114602a().mo73275c().mo101852d()) {
            C63244g.m114602a().mo73275c().mo101846a(true);
            return;
        }
        if ((!C78212bg.m136694a() || !C46788ce.m90134a()) && (gVar = this.f176358i) != null) {
            gVar.mo129692c();
        }
        mo122394c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo122398g() {
        if (this.f176360k) {
            this.f176351b.getEndBtn().setTextColor(getResources().getColor(C33447a.f79499b));
            this.f176351b.getEndBtn().setText(getText(R.string.y9));
            this.f176351b.getStartBtn().setVisibility(8);
            this.f176351b.getTitleView().setVisibility(8);
        } else {
            this.f176351b.getEndBtn().setTextColor(getResources().getColor(C33447a.f79498a));
            this.f176351b.getEndBtn().setText(getText(R.string.y_));
            this.f176351b.getStartBtn().setVisibility(0);
            this.f176351b.getTitleView().setVisibility(0);
            mo122399h();
        }
        this.f176358i.mo122052a(this.f176360k);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C45989b.m88764a().mo77590a(getActivity());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo122392a(List<C43223c> list) {
        C1731i.m5640b(new CallableC78128ad(this, list), C1731i.f5564c).mo5534a(new C78129ae(this), C1731i.f5562a, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo122393b(List<C43223c> list) {
        if (C78215b.C78216a.m136704a()) {
            ArrayList arrayList = new ArrayList();
            for (C43223c cVar : list) {
                if (cVar.f100900W.f100772aE) {
                    arrayList.add(cVar);
                }
            }
            if (!arrayList.isEmpty()) {
                m137011c(arrayList);
            }
        }
    }

    /* renamed from: c */
    private void m137011c(List<C43223c> list) {
        InfoStickerModel j;
        List<StickerItemModel> list2;
        C89219l.m154721d(list, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : list) {
            if (!(!t.f100900W.f100772aE || (j = t.mo73694j()) == null || (list2 = j.stickers) == null)) {
                ArrayList arrayList = new ArrayList();
                for (T t2 : list2) {
                    T t3 = t2;
                    if (t3.type == 0 && !TextUtils.isEmpty(t3.stickerId)) {
                        arrayList.add(t2);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (!(arrayList2 == null || arrayList2.isEmpty() || arrayList2 == null)) {
                    linkedHashMap.put(t, arrayList2);
                }
            }
        }
        this.f176373x = linkedHashMap;
        for (Object obj : linkedHashMap.keySet()) {
            Boolean bool = this.f176365p.get(obj);
            if (bool != null && bool.booleanValue()) {
                this.f176373x.remove(obj);
            }
        }
        for (C43223c cVar : list) {
            if (this.f176373x.containsKey(cVar)) {
                this.f176365p.put(cVar, false);
            } else {
                this.f176365p.put(cVar, true);
            }
        }
        mo122395d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo122389a(C1731i iVar) {
        List<C43223c> list = (List) iVar.mo5545d();
        if (C84892d.m145850a(list)) {
            return null;
        }
        int size = list.size();
        if (!this.f176367r) {
            C39162r.m79460a("click_draft_entrance", new C84425b().mo129403a("draft_cnt", size).mo129406a("enter_from", m137014m()).f188764a);
            this.f176367r = true;
        }
        long j = 0;
        if (this.f176370u != 0) {
            C39162r.m79460a("tool_performance_draft_preview_list", new C84425b().mo129403a("count", list.size()).mo129404a("duration", System.currentTimeMillis() - this.f176370u).f188764a);
            this.f176370u = 0;
        }
        for (C43223c cVar : list) {
            C40340a aVar = new C40340a();
            aVar.mo69486a(cVar);
            if (cVar.f100900W.f100808ao != null) {
                j += aVar.mo69485a();
            }
        }
        C80322d.m139251a("tool_performance_draft_info", new C84425b().mo129403a("count", list.size()).mo129404a("storage_size", j).f188764a);
        return null;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0082 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.ss.android.ugc.aweme.tools.draft.z] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo122391a(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.C78473z.mo122391a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo122390a(C43223c cVar, long j) {
        if (this.f176374y) {
            m137013l();
            C78135ak.m136630a(getActivity(), cVar, this.f176371v, j, m137015n());
        }
    }

    /* renamed from: a */
    public static void m137010a(C43223c cVar, List<? extends Effect> list) {
        List<StickerItemModel> list2;
        InfoStickerModel j = cVar.mo73694j();
        if (!(j == null || (list2 = j.stickers) == null || list2.isEmpty())) {
            for (StickerItemModel stickerItemModel : list2) {
                Iterator<? extends Effect> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    EffectTemplate effectTemplate = (EffectTemplate) it.next();
                    if (stickerItemModel.stickerId.equals(effectTemplate.getEffectId()) && !stickerItemModel.path.equals(effectTemplate.getUnzipPath())) {
                        stickerItemModel.path = effectTemplate.getUnzipPath();
                        break;
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder.AbstractC78113a
    /* renamed from: a */
    public final void mo122028a(int i, final C43223c cVar) {
        if (cVar != null) {
            C84911q.m145921a("draft onEdit: position " + i + ", draftId " + cVar.f100901a);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        if (!cVar.f100900W.f100772aE || !C78215b.C78216a.m136704a()) {
            C78135ak.m136630a(getActivity(), cVar, this.f176371v, currentTimeMillis, m137015n());
            return;
        }
        Boolean bool = this.f176365p.get(cVar);
        if (bool == null || !bool.booleanValue()) {
            getContext();
            if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132253e = m137012k();
            }
            if (!C58029j.f132253e) {
                new C79459a(getContext()).mo123050a(R.string.awu).mo123053a();
                return;
            }
            this.f176374y = true;
            this.f176352c.mo27384f();
            this.f176364o.observe(this, new AbstractC1214u<Boolean>() {
                /* class com.p2082ss.android.ugc.aweme.tools.draft.C78473z.C784784 */

                static {
                    Covode.recordClassIndex(91607);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Boolean bool) {
                    Boolean bool2 = bool;
                    if (bool2 != null) {
                        C78473z.this.f176364o.removeObserver(this);
                        if (bool2.booleanValue()) {
                            Boolean bool3 = C78473z.this.f176365p.get(cVar);
                            if (bool3 == null || !bool3.booleanValue()) {
                                List<? extends Effect> list = C78473z.this.f176363n.get(cVar);
                                if (list == null || list.isEmpty()) {
                                    C78473z.this.mo122390a(cVar, currentTimeMillis);
                                    return;
                                }
                                C78473z.this.f176362m.mo122119a(new C89378p<>(cVar, list), true, (AbstractC89124d<? super C89378p<? extends C43223c, Boolean>>) new AbstractC80358dt<C89378p<? extends C43223c, ? extends Boolean>>() {
                                    /* class com.p2082ss.android.ugc.aweme.tools.draft.C78473z.C784784.C784791 */

                                    static {
                                        Covode.recordClassIndex(91608);
                                    }

                                    @Override // p4600h.p4603c.AbstractC89124d
                                    public final AbstractC89127f getContext() {
                                        return C89133g.INSTANCE;
                                    }

                                    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80358dt
                                    /* renamed from: a */
                                    public final void mo122403a(Throwable th) {
                                        C84911q.m145926b("DraftBoxFragment : onEdit , downloadEffect --- resumeWithException : " + C84911q.m145925b(th));
                                        C78473z.this.mo122396e();
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<com.ss.android.ugc.aweme.draft.model.c, java.lang.Boolean> */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80358dt
                                    /* renamed from: a */
                                    public final /* synthetic */ void mo122402a(C89378p<? extends C43223c, ? extends Boolean> pVar) {
                                        C89378p<? extends C43223c, ? extends Boolean> pVar2 = pVar;
                                        if (((Boolean) pVar2.getSecond()).booleanValue()) {
                                            C78473z.this.f176365p.put(pVar2.getFirst(), pVar2.getSecond());
                                            C78473z.this.mo122390a(cVar, currentTimeMillis);
                                            return;
                                        }
                                        C78473z.this.mo122396e();
                                    }
                                });
                                return;
                            }
                            C78473z.this.mo122390a(cVar, currentTimeMillis);
                            return;
                        }
                        C78473z.this.mo122395d();
                        C78473z.this.mo122396e();
                    }
                }
            });
            return;
        }
        C78135ak.m136630a(getActivity(), cVar, this.f176371v, currentTimeMillis, m137015n());
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56815c, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        int i = Build.VERSION.SDK_INT;
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            this.f176366q.getLayoutParams().height = C18247a.m33946a(activity);
        }
        this.f176351b.setTitle(getText(R.string.bbz));
        this.f176351b.getStartBtn().setVisibility(0);
        this.f176351b.getEndBtn().setVisibility(0);
        this.f176351b.getEndBtn().setTextColor(getResources().getColor(C33447a.f79498a));
        this.f176351b.getEndBtn().setText(getText(R.string.y_));
        this.f176351b.getEndBtn().setFontType(C17303d.f41573g);
        this.f176351b.getEndBtn().setBackgroundColor(0);
        new SafeHandler(getActivity()).post(new RunnableC78130af(this));
        this.f176353d.setOverScrollMode(2);
        if (C46788ce.m90134a()) {
            getActivity();
            WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager();
            this.f176375z = wrapGridLayoutManager;
            this.f176353d.setLayoutManager(wrapGridLayoutManager);
            this.f176353d.mo4402a(new C78174au((int) C13628n.m24520b(getContext(), 1.0f)));
            this.f176358i = new C78413n(this.f176368s, this);
        } else {
            getActivity();
            WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
            this.f176375z = wrapLinearLayoutManager;
            this.f176353d.setLayoutManager(wrapLinearLayoutManager);
            this.f176353d.mo4402a(new C78405c(C0643b.m2378c(getContext(), R.color.c9), (int) C13628n.m24520b(getActivity(), 0.0f), C13628n.m24520b(getActivity(), 0.0f), C13628n.m24520b(getActivity(), 0.0f)));
            this.f176358i = new C78121a(this.f176368s, this);
        }
        C78176aw.f175577b = this.f176375z.mo4730s();
        this.f176358i.mo122055b(this.f176357h);
        this.f176358i.mo129702d(false);
        this.f176358i.mo122049a(new C78131ag(this));
        this.f176353d.setAdapter(this.f176358i);
        this.f176352c.setBuilder(DmtStatusView.C17269a.m31905a(getContext()));
        this.f176351b.getEndBtn().setTypeface(Typeface.create(this.f176351b.getEndBtn().getTypeface(), 0), 0);
        this.f176351b.getEndBtn().setFontType(C17303d.f41567a);
        this.f176351b.getEndBtn().setTextSize(1, 17.0f);
        this.f176351b.getTitleView().setTextSize(1, 17.0f);
        C78397c.m136927a().registerDraftListener(this.f176372w);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f176370u = System.currentTimeMillis();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f176357h = arguments.getBoolean("is_disk_manage_mode", false);
        }
        this.f176362m = new C78215b(this);
        C78176aw.f175578c = true;
        View a = C1764a.m5927a(layoutInflater, R.layout.a0u, viewGroup, false);
        this.f176351b = (ButtonTitleBar) C0792v.m2762c(a, (int) R.id.eiz);
        this.f176366q = C0792v.m2762c(a, (int) R.id.e7_);
        this.f176352c = (DmtStatusView) C0792v.m2762c(a, (int) R.id.aoj);
        this.f176353d = (RecyclerView) C0792v.m2762c(a, (int) R.id.dgw);
        this.f176354e = (TextView) C0792v.m2762c(a, (int) R.id.eux);
        if (this.f176357h) {
            if (this.f176355f == null) {
                TextView textView = (TextView) C0792v.m2762c(a, (int) R.id.ewf);
                this.f176355f = textView;
                textView.setVisibility(0);
            }
            this.f176355f.setVisibility(0);
        }
        FrameLayout frameLayout = (FrameLayout) C0792v.m2762c(a, (int) R.id.c3q);
        this.f176356g = frameLayout;
        if (this.f176357h) {
            frameLayout.setOnClickListener(new View$OnClickListenerC78125aa(this));
        }
        if (this.f176357h) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f176356g.getLayoutParams();
            layoutParams.height = Math.round(C13628n.m24520b(getContext(), 60.0f));
            this.f176356g.setLayoutParams(layoutParams);
        } else {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f176354e.getLayoutParams();
            layoutParams2.gravity = 17;
            layoutParams2.topMargin = 0;
            this.f176354e.setLayoutParams(layoutParams2);
        }
        this.f176351b.setOnTitleBarClickListener(new AbstractC17251a() {
            /* class com.p2082ss.android.ugc.aweme.tools.draft.C78473z.C784752 */

            static {
                Covode.recordClassIndex(91604);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: a */
            public final void mo27339a(View view) {
                C78473z.this.mo122400i();
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: b */
            public final void mo27340b(View view) {
                C78473z zVar = C78473z.this;
                zVar.f176360k = !zVar.f176360k;
                zVar.mo122398g();
            }
        });
        this.f176354e.setOnClickListener(new View$OnClickListenerC78126ab(this));
        return a;
    }
}
