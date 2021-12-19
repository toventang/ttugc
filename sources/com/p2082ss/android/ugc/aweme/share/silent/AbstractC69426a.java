package com.p2082ss.android.ugc.aweme.share.silent;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.UIUXBugsExperimentService;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34597d;
import com.p2082ss.android.ugc.aweme.base.widget.CanCancelRadioButton;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.share.silent.C69471s;
import com.p2082ss.android.ugc.aweme.share.silent.EnumC69448c;
import com.p2082ss.android.ugc.aweme.share.silent.p3775b.C69446a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.silent.a */
public abstract class AbstractC69426a extends AbstractC69445b {

    /* renamed from: f */
    public static final C69427a f155092f = new C69427a((byte) 0);

    /* renamed from: a */
    final Context f155093a;

    /* renamed from: b */
    public boolean f155094b;

    /* renamed from: c */
    public SilentSharePopupWindow f155095c;

    /* renamed from: d */
    int f155096d = 2;

    /* renamed from: e */
    public int f155097e = -1;

    /* renamed from: i */
    private final AbstractC89244h f155098i = C89250i.m154773a((AbstractC89171a) new C69430d(this));

    /* renamed from: j */
    private int f155099j;

    /* renamed from: k */
    private final List<C89378p<EnumC69448c, CanCancelRadioButton>> f155100k = new ArrayList();

    /* renamed from: l */
    private TextView f155101l;

    /* renamed from: m */
    private String f155102m = "";

    /* renamed from: n */
    private int f155103n = 44;

    /* renamed from: o */
    private int f155104o = 30;

    static {
        Covode.recordClassIndex(81764);
    }

    /* renamed from: a */
    public abstract void mo109674a();

    /* renamed from: a */
    public void mo109677a(View view) {
        C89219l.m154721d(view, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69445b
    /* renamed from: a */
    public final void mo109678a(CanCancelRadioButton.AbstractC34737a aVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69445b
    /* renamed from: a */
    public final void mo109679a(boolean z) {
    }

    public abstract int getLayoutResId();

    /* access modifiers changed from: protected */
    public final RadioGroup getRadioGroup() {
        return (RadioGroup) this.f155098i.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69445b
    public void setSaveLocalEnabled(boolean z) {
    }

    /* renamed from: com.ss.android.ugc.aweme.share.silent.a$a */
    public static final class C69427a {
        static {
            Covode.recordClassIndex(81765);
        }

        private C69427a() {
        }

        public /* synthetic */ C69427a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final List<C89378p<EnumC69448c, CanCancelRadioButton>> getButtonPairList() {
        return this.f155100k;
    }

    /* access modifiers changed from: protected */
    public final TextView getSyncTitle() {
        return this.f155101l;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.silent.a$d */
    static final class C69430d extends AbstractC89220m implements AbstractC89171a<RadioGroup> {

        /* renamed from: a */
        final /* synthetic */ AbstractC69426a f155107a;

        static {
            Covode.recordClassIndex(81768);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69430d(AbstractC69426a aVar) {
            super(0);
            this.f155107a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RadioGroup invoke() {
            return this.f155107a.findViewById(R.id.ddv);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69445b
    /* renamed from: c */
    public final String mo109682c() {
        ArrayList arrayList = new ArrayList();
        int saveUploadType = getSaveUploadType();
        if (saveUploadType != 0) {
            arrayList.add(Integer.valueOf(saveUploadType));
        }
        return C69446a.m122653a(";", arrayList);
    }

    /* renamed from: e */
    private void m122630e() {
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        if (!(!EnumC69448c.C69449a.m122656a((Activity) context).isEmpty())) {
            setVisibility(8);
            TextView textView = this.f155101l;
            if (textView != null) {
                textView.setVisibility(8);
            }
            getRadioGroup().setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69445b
    public int getSaveUploadType() {
        for (C89378p<EnumC69448c, CanCancelRadioButton> pVar : this.f155100k) {
            if (pVar.getSecond().getId() == getRadioGroup().getCheckedRadioButtonId()) {
                return pVar.getFirst().getSaveType();
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo109681b() {
        if (getContext() instanceof Activity) {
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            List<EnumC69448c> a = EnumC69448c.C69449a.m122656a((Activity) context);
            if (a.isEmpty()) {
                m122630e();
                return;
            }
            for (EnumC69448c cVar : C89070n.m154571d((Iterable) a, 4)) {
                View a2 = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.ayw, getRadioGroup(), false);
                Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton");
                CanCancelRadioButton canCancelRadioButton = (CanCancelRadioButton) a2;
                canCancelRadioButton.setTag(cVar);
                Context context2 = getContext();
                C89219l.m154716b(context2, "");
                canCancelRadioButton.setBackground(C69471s.C69472a.m122692a(context2, cVar.getUncheckedIconRes(), cVar.getCheckedIconRes(), this.f155103n, this.f155104o));
                canCancelRadioButton.setId(View.generateViewId());
                mo109677a((View) canCancelRadioButton);
                canCancelRadioButton.setOnClickListener(new View$OnClickListenerC69428b(this));
                getRadioGroup().addView(canCancelRadioButton);
                this.f155100k.add(new C89378p<>(cVar, canCancelRadioButton));
            }
            int a3 = C34597d.m70634a().mo61048a("key_silent_share_save", 0);
            for (C89378p<EnumC69448c, CanCancelRadioButton> pVar : this.f155100k) {
                if (pVar.getFirst().getSaveType() == a3) {
                    pVar.getSecond().setChecked(true);
                    this.f155097e = pVar.getSecond().getId();
                }
            }
            getRadioGroup().setOnCheckedChangeListener(new C69429c(this));
        }
    }

    /* access modifiers changed from: protected */
    public final void setSyncTitle(TextView textView) {
        this.f155101l = textView;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69445b
    public void setSyncShareViewTextColor(int i) {
        TextView textView = this.f155101l;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69445b
    public void setSyncShareViewTextSize(float f) {
        TextView textView = this.f155101l;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69445b
    public void setSyncShareViewTitle(String str) {
        TextView textView = this.f155101l;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ SilentSharePopupWindow m122628a(AbstractC69426a aVar) {
        SilentSharePopupWindow silentSharePopupWindow = aVar.f155095c;
        if (silentSharePopupWindow == null) {
            C89219l.m154710a("popupWindow");
        }
        return silentSharePopupWindow;
    }

    /* renamed from: a */
    private static String m122629a(Object obj) {
        String obj2;
        if (obj == null || (obj2 = obj.toString()) == null) {
            return "";
        }
        return obj2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.silent.a$b */
    public static final class View$OnClickListenerC69428b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC69426a f155105a;

        static {
            Covode.recordClassIndex(81766);
        }

        View$OnClickListenerC69428b(AbstractC69426a aVar) {
            this.f155105a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SharePrefCache inst = SharePrefCache.inst();
            C89219l.m154716b(inst, "");
            C33594aj<Boolean> isAwemePrivate = inst.getIsAwemePrivate();
            C89219l.m154716b(isAwemePrivate, "");
            Boolean c = isAwemePrivate.mo59941c();
            C89219l.m154716b(c, "");
            if (c.booleanValue()) {
                C89219l.m154716b(view, "");
                new C23144b(view).mo37635a(this.f155105a.getContext().getString(R.string.ete)).mo37637b();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC69426a(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        C1764a.m5927a(LayoutInflater.from(context), getLayoutResId(), this, true);
        this.f155093a = context;
        mo109674a();
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69445b
    public void setSyncIconSize(int i) {
        for (C89378p<EnumC69448c, CanCancelRadioButton> pVar : this.f155100k) {
            ViewGroup.LayoutParams layoutParams = pVar.getSecond().getLayoutParams();
            layoutParams.height = i;
            layoutParams.width = i;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69445b
    /* renamed from: a */
    public final void mo109675a(int i) {
        boolean z;
        int i2 = 0;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f155099j = i;
        SharePrefCache inst = SharePrefCache.inst();
        C89219l.m154716b(inst, "");
        C33594aj<Boolean> isAwemePrivate = inst.getIsAwemePrivate();
        C89219l.m154716b(isAwemePrivate, "");
        isAwemePrivate.mo59940b(Boolean.valueOf(z));
        ShareDependService a = ShareDependService.C68822a.m121324a();
        Context context = getContext();
        C89219l.m154716b(context, "");
        a.mo109336a(context, z);
        if (z) {
            if (getRadioGroup().getCheckedRadioButtonId() != -1) {
                getRadioGroup().check(-1);
            }
            for (C89378p<EnumC69448c, CanCancelRadioButton> pVar : this.f155100k) {
                pVar.getSecond().setCanChecked(false);
            }
        } else {
            for (C89378p<EnumC69448c, CanCancelRadioButton> pVar2 : this.f155100k) {
                pVar2.getSecond().setCanChecked(true);
            }
        }
        TextView textView = this.f155101l;
        if (textView != null) {
            if (z) {
                i2 = 8;
            }
            textView.setVisibility(i2);
        }
        m122630e();
    }

    /* renamed from: a */
    public final void mo109676a(int i, int i2) {
        this.f155103n = i;
        this.f155104o = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.silent.a$c */
    public static final class C69429c implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC69426a f155106a;

        static {
            Covode.recordClassIndex(81767);
        }

        C69429c(AbstractC69426a aVar) {
            this.f155106a = aVar;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            int width;
            AbstractC69426a aVar = this.f155106a;
            if (aVar.f155097e != i) {
                byte b = 0;
                if (i == -1) {
                    C34597d.m70634a().mo61056b("key_silent_share_save", 0);
                }
                int i2 = 1;
                if (!aVar.f155094b) {
                    aVar.f155094b = true;
                    AVExternalServiceImpl.m113114a().publishService().cancelSynthetise(aVar.getContext());
                }
                if (aVar.f155095c != null && AbstractC69426a.m122628a(aVar).isShowing()) {
                    AbstractC69426a.m122628a(aVar).dismiss();
                }
                for (C89378p<EnumC69448c, CanCancelRadioButton> pVar : aVar.getButtonPairList()) {
                    if (pVar.getSecond().getId() == i) {
                        C34597d.m70634a().mo61056b("key_silent_share_save", pVar.getFirst().getSaveType());
                        CanCancelRadioButton second = pVar.getSecond();
                        String label = pVar.getFirst().getLabel();
                        C89219l.m154721d(second, "");
                        C89219l.m154721d(label, "");
                        if (C34597d.m70634a().mo61048a("key_pop_up_window_share_count", (int) b) < 3 && aVar.f155096d > 0) {
                            aVar.f155096d -= i2;
                            if (aVar.f155095c != null) {
                                SilentSharePopupWindow silentSharePopupWindow = aVar.f155095c;
                                if (silentSharePopupWindow == null) {
                                    C89219l.m154710a("popupWindow");
                                }
                                if (silentSharePopupWindow.isShowing()) {
                                    SilentSharePopupWindow silentSharePopupWindow2 = aVar.f155095c;
                                    if (silentSharePopupWindow2 == null) {
                                        C89219l.m154710a("popupWindow");
                                    }
                                    silentSharePopupWindow2.dismiss();
                                }
                            }
                            Context context = aVar.getContext();
                            C89219l.m154716b(context, "");
                            Resources resources = aVar.getResources();
                            Object[] objArr = new Object[i2];
                            objArr[b] = label;
                            String string = resources.getString(R.string.f93, objArr);
                            C89219l.m154716b(string, "");
                            aVar.f155095c = new SilentSharePopupWindow(context, string, (int) C13628n.m24520b(aVar.getContext(), 3.0f), b);
                            SilentSharePopupWindow silentSharePopupWindow3 = aVar.f155095c;
                            if (silentSharePopupWindow3 == null) {
                                C89219l.m154710a("popupWindow");
                            }
                            silentSharePopupWindow3.getContentView().measure(b, b);
                            float b2 = C13628n.m24520b(aVar.getContext(), 10.0f);
                            SilentSharePopupWindow silentSharePopupWindow4 = aVar.f155095c;
                            if (silentSharePopupWindow4 == null) {
                                C89219l.m154710a("popupWindow");
                            }
                            View contentView = silentSharePopupWindow4.getContentView();
                            C89219l.m154716b(contentView, "");
                            int measuredWidth = contentView.getMeasuredWidth();
                            SilentSharePopupWindow silentSharePopupWindow5 = aVar.f155095c;
                            if (silentSharePopupWindow5 == null) {
                                C89219l.m154710a("popupWindow");
                            }
                            View contentView2 = silentSharePopupWindow5.getContentView();
                            C89219l.m154716b(contentView2, "");
                            int measuredHeight = contentView2.getMeasuredHeight();
                            SilentSharePopupWindow silentSharePopupWindow6 = aVar.f155095c;
                            if (silentSharePopupWindow6 == null) {
                                C89219l.m154710a("popupWindow");
                            }
                            ImageView imageView = (ImageView) silentSharePopupWindow6.getContentView().findViewById(R.id.bsz);
                            SilentSharePopupWindow silentSharePopupWindow7 = aVar.f155095c;
                            if (silentSharePopupWindow7 == null) {
                                C89219l.m154710a("popupWindow");
                            }
                            ImageView imageView2 = (ImageView) silentSharePopupWindow7.getContentView().findViewById(R.id.bt0);
                            if (UIUXBugsExperimentService.m65442b().mo57250a()) {
                                imageView.setColorFilter(C0643b.m2378c(aVar.getContext(), R.color.bm));
                                imageView2.setColorFilter(C0643b.m2378c(aVar.getContext(), R.color.bm));
                            }
                            int[] iArr = new int[2];
                            second.getLocationOnScreen(iArr);
                            int a = C13628n.m24504a(aVar.f155093a);
                            int width2 = iArr[b] + (second.getWidth() / 2);
                            int i3 = measuredWidth / 2;
                            float f = (float) width2;
                            if (((float) i3) + b2 > f) {
                                width = (int) (b2 - ((float) iArr[0]));
                                C89219l.m154716b(imageView, "");
                                imageView.getLayoutParams().width = (int) (f - b2);
                                C89219l.m154716b(imageView2, "");
                                imageView2.getLayoutParams().width = measuredWidth - imageView.getLayoutParams().width;
                            } else {
                                float f2 = ((float) a) - b2;
                                if (((float) (width2 + i3)) > f2) {
                                    width = (int) (f2 - ((float) (iArr[0] + measuredWidth)));
                                    C89219l.m154716b(imageView2, "");
                                    imageView2.getLayoutParams().width = (int) (f2 - f);
                                    C89219l.m154716b(imageView, "");
                                    imageView.getLayoutParams().width = measuredWidth - imageView2.getLayoutParams().width;
                                } else {
                                    width = (second.getWidth() - measuredWidth) / 2;
                                    C89219l.m154716b(imageView, "");
                                    imageView.getLayoutParams().width = i3;
                                    C89219l.m154716b(imageView2, "");
                                    imageView2.getLayoutParams().width = i3;
                                }
                            }
                            imageView.getLayoutParams().height = measuredHeight;
                            imageView2.getLayoutParams().height = measuredHeight;
                            SilentSharePopupWindow silentSharePopupWindow8 = aVar.f155095c;
                            if (silentSharePopupWindow8 == null) {
                                C89219l.m154710a("popupWindow");
                            }
                            silentSharePopupWindow8.getContentView().measure(0, 0);
                            View contentView3 = silentSharePopupWindow8.getContentView();
                            C89219l.m154716b(contentView3, "");
                            silentSharePopupWindow8.f155085c = contentView3.getMeasuredHeight();
                            View contentView4 = silentSharePopupWindow8.getContentView();
                            C89219l.m154716b(contentView4, "");
                            silentSharePopupWindow8.f155084b = contentView4.getMeasuredWidth();
                            try {
                                SilentSharePopupWindow silentSharePopupWindow9 = aVar.f155095c;
                                if (silentSharePopupWindow9 == null) {
                                    C89219l.m154710a("popupWindow");
                                }
                                if (!(silentSharePopupWindow9.f155086d instanceof Activity) || !((Activity) silentSharePopupWindow9.f155086d).isFinishing()) {
                                    int i4 = Build.VERSION.SDK_INT;
                                    silentSharePopupWindow9.showAsDropDown(second, width, -(second.getHeight() + silentSharePopupWindow9.f155085c + silentSharePopupWindow9.f155087e), 51);
                                    silentSharePopupWindow9.getContentView().removeCallbacks(silentSharePopupWindow9.f155083a);
                                    silentSharePopupWindow9.getContentView().postDelayed(silentSharePopupWindow9.f155083a, 5000);
                                }
                            } catch (Exception unused) {
                            }
                        }
                        aVar.mo109680a(true, pVar.getFirst().getKey());
                    }
                    if (pVar.getSecond().getId() == aVar.f155097e) {
                        aVar.mo109680a(false, pVar.getFirst().getKey());
                    }
                    b = 0;
                    i2 = 1;
                }
                aVar.f155097e = i;
            }
        }
    }

    /* renamed from: a */
    public final void mo109680a(boolean z, String str) {
        String str2;
        Object tag = getTag();
        if (!(tag instanceof Map)) {
            tag = null;
        }
        Map map = (Map) tag;
        if (map != null) {
            if (z) {
                str2 = "publish_share_confirm";
            } else {
                str2 = "publish_share_cancel";
            }
            C39162r.m79460a(str2, new C33744d().mo59983a("creation_id", m122629a(map.get("creation_id"))).mo59983a("enter_from", m122629a(map.get("enter_from"))).mo59983a("content_type", m122629a(map.get("content_type"))).mo59983a("shoot_way", m122629a(map.get("shoot_way"))).mo59983a("share_to", str).f79943a);
            if (z) {
                mo109697d();
            }
        }
    }
}
