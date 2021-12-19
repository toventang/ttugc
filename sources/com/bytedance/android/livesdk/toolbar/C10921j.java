package com.bytedance.android.livesdk.toolbar;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p385p.C5839d;
import com.bytedance.android.live.p385p.C5845j;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p385p.EnumC5854q;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadSetting;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.toolbar.j */
public final class C10921j {

    /* renamed from: a */
    final Map<EnumC5847l, View> f26235a = new EnumMap(EnumC5847l.class);

    /* renamed from: b */
    final LinkedList<EnumC5847l> f26236b = new LinkedList<>();

    /* renamed from: c */
    public final DataChannel f26237c;

    /* renamed from: d */
    List<? extends EnumC5847l> f26238d;

    /* renamed from: e */
    public final EnumC5854q f26239e;

    /* renamed from: f */
    final ConcurrentHashMap<EnumC5847l, AbstractView$OnClickListenerC5841f> f26240f;

    /* renamed from: g */
    private final LinearLayout f26241g;

    static {
        Covode.recordClassIndex(12529);
    }

    /* renamed from: a */
    public final void mo17775a() {
        ConcurrentHashMap<EnumC5847l, AbstractView$OnClickListenerC5841f> concurrentHashMap = this.f26240f;
        if (concurrentHashMap != null) {
            for (Map.Entry<EnumC5847l, AbstractView$OnClickListenerC5841f> entry : concurrentHashMap.entrySet()) {
                mo17777a(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: b */
    public final void mo17780b() {
        AbstractView$OnClickListenerC5841f fVar;
        MethodCollector.m26663i(1360);
        for (T t : this.f26236b) {
            View view = this.f26235a.get(t);
            if (view != null) {
                ConcurrentHashMap<EnumC5847l, AbstractView$OnClickListenerC5841f> concurrentHashMap = this.f26240f;
                if (!(concurrentHashMap == null || (fVar = concurrentHashMap.get(t)) == null)) {
                    fVar.mo8493b(view, this.f26237c);
                }
                this.f26241g.removeView(view);
                this.f26235a.remove(t);
            }
        }
        this.f26236b.clear();
        MethodCollector.m26664o(1360);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.toolbar.j$a */
    public static final class View$OnClickListenerC10922a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10921j f26242a;

        /* renamed from: b */
        final /* synthetic */ AbstractView$OnClickListenerC5841f f26243b;

        /* renamed from: c */
        final /* synthetic */ EnumC5847l f26244c;

        static {
            Covode.recordClassIndex(12530);
        }

        View$OnClickListenerC10922a(C10921j jVar, AbstractView$OnClickListenerC5841f fVar, EnumC5847l lVar) {
            this.f26242a = jVar;
            this.f26243b = fVar;
            this.f26244c = lVar;
        }

        public final void onClick(View view) {
            DataChannel dataChannel;
            this.f26243b.onClick(view);
            if (this.f26242a.f26239e.isPopup() && this.f26244c != EnumC5847l.REVERSE_CAMERA && this.f26244c != EnumC5847l.REVERSE_MIRROR && (dataChannel = this.f26242a.f26237c) != null) {
                dataChannel.mo28319c(C5839d.class);
            }
        }
    }

    /* renamed from: a */
    public final void mo17776a(EnumC5847l lVar) {
        AbstractView$OnClickListenerC5841f fVar;
        MethodCollector.m26663i(1331);
        C89219l.m154721d(lVar, "");
        View view = this.f26235a.get(lVar);
        if (view == null) {
            MethodCollector.m26664o(1331);
            return;
        }
        ConcurrentHashMap<EnumC5847l, AbstractView$OnClickListenerC5841f> concurrentHashMap = this.f26240f;
        if (!(concurrentHashMap == null || (fVar = concurrentHashMap.get(lVar)) == null)) {
            fVar.mo8493b(view, this.f26237c);
        }
        C11279p.m20006a(view);
        this.f26241g.removeView(view);
        this.f26236b.remove(lVar);
        this.f26235a.remove(lVar);
        MethodCollector.m26664o(1331);
    }

    /* renamed from: a */
    public final void mo17777a(EnumC5847l lVar, AbstractView$OnClickListenerC5841f fVar) {
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(fVar, "");
        mo17778a(lVar, fVar, true);
    }

    /* renamed from: a */
    public final void mo17779a(EnumC5847l lVar, boolean z) {
        AbstractView$OnClickListenerC5841f fVar;
        View findViewById;
        int i;
        C89219l.m154721d(lVar, "");
        View view = this.f26235a.get(lVar);
        if (!(view == null || (findViewById = view.findViewById(R.id.eki)) == null)) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById.setVisibility(i);
        }
        ConcurrentHashMap<EnumC5847l, AbstractView$OnClickListenerC5841f> concurrentHashMap = this.f26240f;
        if (concurrentHashMap != null && (fVar = concurrentHashMap.get(lVar)) != null) {
            fVar.mo8492a(z);
        }
    }

    /* renamed from: a */
    public final void mo17778a(EnumC5847l lVar, AbstractView$OnClickListenerC5841f fVar, boolean z) {
        int layoutId;
        View view;
        int i;
        LiveTextView liveTextView;
        LiveTextView liveTextView2;
        int drawable;
        Integer c;
        MethodCollector.m26663i(1322);
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(fVar, "");
        if (!this.f26238d.contains(lVar)) {
            MethodCollector.m26664o(1322);
        } else if (!this.f26236b.contains(lVar) || z) {
            if (this.f26236b.contains(lVar)) {
                mo17776a(lVar);
            }
            this.f26236b.add(lVar);
            Integer layoutId2 = lVar.getLayoutId();
            if (layoutId2 != null) {
                layoutId = layoutId2.intValue();
            } else {
                layoutId = this.f26239e.getLayoutId();
            }
            if (!(lVar.getLayoutId() == null || !this.f26239e.getHasText() || (c = C10919h.m19531c(lVar)) == null)) {
                layoutId = c.intValue();
            }
            if (!LiveLayoutPreloadSetting.INSTANCE.enable() || lVar.getLayoutId() != null || (view = C10925m.m19553a(this.f26241g.getContext(), this.f26239e)) == null) {
                view = C11279p.m20000a((ViewGroup) this.f26241g, layoutId, false);
            }
            Integer a = C5845j.m12788a(lVar);
            if (a != null) {
                view.setId(a.intValue());
            }
            if (lVar.getLayoutId() == null) {
                ImageView imageView = (ImageView) view.findViewById(R.id.ek8);
                if (imageView != null) {
                    Integer rTLDrawable = lVar.getRTLDrawable();
                    if (rTLDrawable != null) {
                        drawable = rTLDrawable.intValue();
                    } else {
                        drawable = lVar.getDrawable();
                    }
                    imageView.setBackgroundResource(drawable);
                }
                if (this.f26239e.getHasTitle() && (liveTextView2 = (LiveTextView) view.findViewById(R.id.ekk)) != null) {
                    liveTextView2.setText(lVar.getTitleId());
                }
                if (this.f26239e.getHasText()) {
                    Integer a2 = C10919h.m19529a(lVar);
                    if (a2 != null) {
                        int intValue = a2.intValue();
                        ImageView imageView2 = (ImageView) view.findViewById(R.id.ek8);
                        if (imageView2 != null) {
                            imageView2.setBackgroundResource(intValue);
                        }
                    }
                    CharSequence b = C10919h.m19530b(lVar);
                    if (!(b == null || (liveTextView = (LiveTextView) view.findViewById(R.id.ekj)) == null)) {
                        liveTextView.setText(b);
                    }
                }
            }
            view.setOnClickListener(new View$OnClickListenerC10922a(this, fVar, lVar));
            if (lVar.isButtonVisible) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            view.setTag(lVar);
            this.f26235a.put(lVar, view);
            view.setClickable(lVar.isEnableClick);
            mo17779a(lVar, lVar.isRedDotVisible);
            fVar.mo8491a(view, this.f26237c);
            if (lVar.getLayoutId() == null) {
                LinearLayout linearLayout = this.f26241g;
                LinkedList<EnumC5847l> linkedList = this.f26236b;
                ArrayList arrayList = new ArrayList();
                for (T t : linkedList) {
                    if (this.f26238d.indexOf(t) < this.f26238d.indexOf(lVar)) {
                        arrayList.add(t);
                    }
                }
                linearLayout.addView(view, arrayList.size(), this.f26239e.getLayoutParams());
                MethodCollector.m26664o(1322);
                return;
            }
            LinearLayout linearLayout2 = this.f26241g;
            LinkedList<EnumC5847l> linkedList2 = this.f26236b;
            ArrayList arrayList2 = new ArrayList();
            for (T t2 : linkedList2) {
                if (this.f26238d.indexOf(t2) < this.f26238d.indexOf(lVar)) {
                    arrayList2.add(t2);
                }
            }
            linearLayout2.addView(view, arrayList2.size());
            MethodCollector.m26664o(1322);
        } else {
            MethodCollector.m26664o(1322);
        }
    }

    public C10921j(DataChannel dataChannel, LinearLayout linearLayout, List<? extends EnumC5847l> list, EnumC5854q qVar, ConcurrentHashMap<EnumC5847l, AbstractView$OnClickListenerC5841f> concurrentHashMap) {
        C89219l.m154721d(linearLayout, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(qVar, "");
        this.f26237c = dataChannel;
        this.f26241g = linearLayout;
        this.f26238d = list;
        this.f26239e = qVar;
        this.f26240f = concurrentHashMap;
    }
}
