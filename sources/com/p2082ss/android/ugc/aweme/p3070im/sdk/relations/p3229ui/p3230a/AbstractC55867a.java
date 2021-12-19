package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.common.C17177c;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.github.p1912a.p1913a.C25040a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53700k;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55083f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.C55289a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.C55717a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.C55726d;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a */
public abstract class AbstractC55867a extends RecyclerView.AbstractC1350a<C55871b> {

    /* renamed from: a */
    protected int f127341a;

    /* renamed from: b */
    public boolean f127342b = false;

    /* renamed from: c */
    protected List<IMContact> f127343c = new ArrayList();

    /* renamed from: d */
    public boolean f127344d;

    /* renamed from: e */
    protected String f127345e;

    /* renamed from: f */
    public LinkedHashSet<IMContact> f127346f = new LinkedHashSet<>();

    /* renamed from: g */
    protected View f127347g;

    /* renamed from: h */
    protected RecyclerView f127348h;

    /* renamed from: i */
    public LinearLayoutManager f127349i;

    /* renamed from: j */
    public Runnable f127350j;

    /* renamed from: k */
    public AbstractC55870a f127351k;

    /* renamed from: l */
    protected RecyclerView.AbstractC1371n f127352l;

    /* renamed from: m */
    private Animator.AnimatorListener f127353m = new Animator.AnimatorListener() {
        /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a.C558692 */

        static {
            Covode.recordClassIndex(65659);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            AbstractC55867a.this.notifyDataSetChanged();
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a$a */
    public interface AbstractC55870a {
        static {
            Covode.recordClassIndex(65660);
        }

        /* renamed from: a */
        void mo92728a(View view, int i);
    }

    static {
        Covode.recordClassIndex(65657);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo92715a(IMContact iMContact);

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ C55871b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m101638a(this, viewGroup, i);
    }

    /* renamed from: b */
    public final int mo92722b() {
        if (this.f127347g != null) {
            return 1;
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a$b */
    public class C55871b extends C55289a<IMContact> {

        /* renamed from: a */
        protected TuxCheckBox f127356a;

        /* renamed from: b */
        protected int f127357b = Math.round(C13628n.m24520b(C17867d.m33078a(), 16.0f));

        /* renamed from: c */
        protected int f127358c = (((int) C13628n.m24520b(C17867d.m33078a(), -32.0f)) - 1);

        /* renamed from: e */
        private AvatarImageView f127360e;

        /* renamed from: f */
        private TextView f127361f;

        /* renamed from: g */
        private TextView f127362g;

        /* renamed from: h */
        private TextView f127363h;

        /* renamed from: i */
        private ImageView f127364i;

        /* renamed from: j */
        private TuxIconView f127365j;

        /* renamed from: k */
        private View f127366k;

        static {
            Covode.recordClassIndex(65661);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.C55289a
        /* renamed from: c */
        public final void mo92309c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.C55289a
        /* renamed from: a */
        public final void mo92307a() {
            super.mo92307a();
            this.itemView.setBackground(C17177c.m31711c(this.itemView.getContext()));
        }

        /* renamed from: d */
        public final Animator mo92730d() {
            ValueAnimator ofInt = ValueAnimator.ofInt(this.f127358c, this.f127357b);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a.C55871b.C558732 */

                static {
                    Covode.recordClassIndex(65663);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (C55871b.this.f127356a != null) {
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) C55871b.this.f127356a.getLayoutParams();
                        marginLayoutParams.setMargins(intValue, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        C55871b.this.f127356a.setLayoutParams(marginLayoutParams);
                    }
                }
            });
            return ofInt;
        }

        /* renamed from: e */
        public final Animator mo92731e() {
            ValueAnimator ofInt = ValueAnimator.ofInt(this.f127357b, this.f127358c);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a.C55871b.C558743 */

                static {
                    Covode.recordClassIndex(65664);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (C55871b.this.f127356a != null) {
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) C55871b.this.f127356a.getLayoutParams();
                        marginLayoutParams.setMargins(intValue, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        C55871b.this.f127356a.setLayoutParams(marginLayoutParams);
                    }
                }
            });
            return ofInt;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.C55289a
        /* renamed from: b */
        public void mo92308b() {
            super.mo92308b();
            this.f127366k = this.itemView.findViewById(R.id.c93);
            this.f127360e = (AvatarImageView) this.itemView.findViewById(R.id.on);
            this.f127356a = (TuxCheckBox) this.itemView.findViewById(R.id.a4l);
            this.f127361f = (TextView) this.itemView.findViewById(R.id.cpq);
            this.f127362g = (TextView) this.itemView.findViewById(R.id.akb);
            this.f127365j = (TuxIconView) this.itemView.findViewById(R.id.b6o);
            this.f127363h = (TextView) this.itemView.findViewById(R.id.title_tv);
            this.f127364i = (ImageView) this.itemView.findViewById(R.id.fbe);
        }

        public C55871b(View view) {
            super(view);
            view.setTag(this);
        }

        /* renamed from: a */
        public void mo92729a(IMContact iMContact, int i) {
            int i2;
            if (iMContact.getType() != -1) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f127356a.getLayoutParams();
                if (AbstractC55867a.this.f127344d) {
                    if (AbstractC55867a.this.f127346f.contains(iMContact)) {
                        this.f127356a.setChecked(true);
                    } else {
                        this.f127356a.setChecked(false);
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    int marginStart = marginLayoutParams.getMarginStart();
                    int i4 = this.f127357b;
                    if (marginStart != i4) {
                        marginLayoutParams.setMargins(i4, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        marginLayoutParams.setMarginStart(this.f127357b);
                        this.f127356a.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    this.f127356a.setChecked(false);
                    int i5 = Build.VERSION.SDK_INT;
                    int marginStart2 = marginLayoutParams.getMarginStart();
                    int i6 = this.f127358c;
                    if (marginStart2 != i6) {
                        marginLayoutParams.setMargins(i6, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        marginLayoutParams.setMarginStart(this.f127358c);
                        this.f127356a.setLayoutParams(marginLayoutParams);
                    }
                }
                if (iMContact.getType() == 2) {
                    this.f127363h.setText(R.string.cgc);
                    this.f127363h.setVisibility(0);
                    this.f127366k.setVisibility(8);
                } else if (iMContact.getType() == 3) {
                    View view = this.f127366k;
                    if (i == 0) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    view.setVisibility(i2);
                    this.f127363h.setText(R.string.cfe);
                    this.f127363h.setVisibility(0);
                } else {
                    this.f127363h.setVisibility(8);
                    this.f127366k.setVisibility(8);
                }
                UrlModel displayAvatar = iMContact.getDisplayAvatar();
                if (displayAvatar == null || displayAvatar.getUrlList() == null || displayAvatar.getUrlList().size() == 0) {
                    C34577e.m70591a(this.f127360e, 2131232314);
                } else {
                    C34577e.m70592a(this.f127360e, displayAvatar);
                }
                IMUser a = C55083f.m100745a(iMContact);
                if (a != null) {
                    C80581io.m139704a(this.itemView.getContext(), a.getCustomVerify(), a.getEnterpriseVerifyReason(), this.f127361f);
                    AbstractC55867a.m101639a(this.f127361f, a, AbstractC55867a.this.f127345e);
                    if (!TextUtils.isEmpty(AbstractC55867a.this.mo92715a(iMContact)) && !TextUtils.isEmpty(AbstractC55867a.this.f127345e)) {
                        AbstractC55867a.m101641b(this.f127362g, a, AbstractC55867a.this.f127345e);
                    } else if (TextUtils.isEmpty(AbstractC55867a.this.mo92715a(iMContact))) {
                        this.f127362g.setVisibility(8);
                    } else {
                        this.f127362g.setVisibility(0);
                        this.f127362g.setText(AbstractC55867a.this.mo92715a(iMContact));
                    }
                    if (C55197c.m100918a(a)) {
                        this.f127365j.setVisibility(8);
                    } else if (a.getFollowStatus() == 2) {
                        this.f127365j.setVisibility(0);
                    } else {
                        this.f127365j.setVisibility(8);
                    }
                } else {
                    C80581io.m139704a(this.itemView.getContext(), "", "", this.f127361f);
                    this.f127362g.setVisibility(8);
                    this.f127365j.setVisibility(8);
                    if (TextUtils.isEmpty(AbstractC55867a.this.f127345e)) {
                        this.f127361f.setText(iMContact.getDisplayName());
                    } else {
                        AbstractC55867a.m101640a(this.f127361f, iMContact.getDisplayName(), AbstractC55867a.this.f127345e, 0);
                    }
                }
                if (AbstractC55867a.this.f127351k != null) {
                    this.itemView.setOnClickListener(new View.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a.C55871b.View$OnClickListenerC558721 */

                        static {
                            Covode.recordClassIndex(65662);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            AbstractC55867a.this.f127351k.mo92728a(C55871b.this.itemView, C55871b.this.getAdapterPosition());
                        }
                    });
                }
                this.f127360e.setTag(50331648, 50331649);
                this.f127360e.setTag(83886080, iMContact);
                this.itemView.setTag(50331648, 50331648);
                this.itemView.setTag(83886080, iMContact);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        List<IMContact> list = this.f127343c;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.f127343c.size();
    }

    /* renamed from: c */
    private void m101642c() {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builder = null;
        for (int i = 0; i < this.f127349i.mo4730s(); i++) {
            View g = this.f127349i.mo4717g(i);
            if (g != null) {
                C55871b bVar = (C55871b) g.getTag();
                if (builder == null) {
                    builder = animatorSet.play(bVar.mo92731e());
                } else {
                    builder.with(bVar.mo92731e());
                }
            }
        }
        animatorSet.setDuration(300L);
        animatorSet.addListener(this.f127353m);
        animatorSet.start();
    }

    /* renamed from: a */
    public final IMContact[] mo92721a() {
        return (IMContact[]) this.f127346f.toArray(new IMContact[0]);
    }

    /* renamed from: a */
    public void mo92716a(int i) {
        notifyItemChanged(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f127348h = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo92723b(int i) {
        if (i < mo92722b()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemViewType(int i) {
        if (this.f127343c.get(i).getType() == -1) {
            return -1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f127348h = recyclerView;
        this.f127349i = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (this.f127352l == null) {
            this.f127352l = new RecyclerView.AbstractC1371n() {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a.C558681 */

                static {
                    Covode.recordClassIndex(65658);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
                /* renamed from: a */
                public final void mo4753a(RecyclerView recyclerView, int i) {
                    super.mo4753a(recyclerView, i);
                    int n = AbstractC55867a.this.f127349i.mo4374n();
                    if (AbstractC55867a.this.f127341a == 0 && n == AbstractC55867a.this.getItemCount() - 1 && AbstractC55867a.this.f127350j != null) {
                        C53700k.m98969a(AbstractC55867a.this.f127350j);
                    }
                }
            };
        }
        this.f127348h.mo4405a(this.f127352l);
    }

    /* renamed from: a */
    public final void mo92718a(List<IMContact> list) {
        this.f127345e = null;
        this.f127343c.clear();
        this.f127341a = 0;
        this.f127343c.addAll(list);
        if (this.f127343c.isEmpty()) {
            IMUser iMUser = new IMUser();
            iMUser.setType(-1);
            this.f127343c.add(iMUser);
        } else if (this.f127343c.size() != 1 || this.f127343c.get(0).getType() != -1) {
            if (this.f127343c.get(0).getType() == -1) {
                this.f127343c.remove(0);
            }
        } else {
            return;
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo92720a(boolean z) {
        if (this.f127344d != z) {
            this.f127344d = z;
            if (!z) {
                this.f127346f.clear();
            }
            if (this.f127344d) {
                AnimatorSet animatorSet = new AnimatorSet();
                AnimatorSet.Builder builder = null;
                for (int i = 0; i < this.f127349i.mo4730s(); i++) {
                    View g = this.f127349i.mo4717g(i);
                    if (g != null) {
                        C55871b bVar = (C55871b) g.getTag();
                        if (builder == null) {
                            builder = animatorSet.play(bVar.mo92730d());
                        } else {
                            builder.with(bVar.mo92730d());
                        }
                    }
                }
                animatorSet.setDuration(300L);
                animatorSet.addListener(this.f127353m);
                animatorSet.start();
                return;
            }
            m101642c();
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(C55871b bVar, int i) {
        bVar.mo92729a(this.f127343c.get(i), i);
    }

    /* renamed from: a */
    public C55871b mo92714a(ViewGroup viewGroup, int i) {
        int i2;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            i2 = R.layout.a6f;
        } else {
            i2 = R.layout.a6e;
        }
        return new C55871b(C1764a.m5927a(from, i2, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo92719a(List<IMContact> list, CharSequence charSequence) {
        this.f127341a = 1;
        this.f127345e = charSequence.toString();
        this.f127343c.clear();
        this.f127343c.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m101638a(AbstractC55867a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        C55871b a2 = aVar.mo92714a(viewGroup, i);
        try {
            if (a2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = a2.getClass().getName();
        return a2;
    }

    /* renamed from: a */
    protected static void m101639a(TextView textView, IMUser iMUser, String str) {
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            textView.setText(iMUser.getDisplayId());
            return;
        }
        String displayId = iMUser.getDisplayId();
        if (!TextUtils.isEmpty(displayId) && !displayId.contains(str) && (indexOf = displayId.toLowerCase().indexOf((str = str.toLowerCase()))) != -1) {
            str = displayId.substring(indexOf, Math.min(str.length() + indexOf, displayId.length()));
        }
        m101640a(textView, iMUser.getDisplayId(), str, 0);
    }

    /* renamed from: b */
    protected static void m101641b(TextView textView, IMUser iMUser, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (iMUser.getSearchType() == 5) {
                if (!TextUtils.isEmpty(iMUser.getSignature())) {
                    textView.setText(iMUser.getSignature());
                    textView.setVisibility(0);
                }
                textView.setVisibility(8);
            } else if (iMUser.getSearchType() != 3) {
                String str2 = "";
                if (iMUser.getSearchType() == 1) {
                    String displayId = iMUser.getDisplayId();
                    String lowerCase = C55717a.m101465c(displayId).toLowerCase();
                    if (!TextUtils.isEmpty(displayId)) {
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < displayId.length(); i++) {
                            sb.append(C25040a.m48012a(displayId.charAt(i)).charAt(0));
                        }
                        str2 = sb.toString();
                    }
                    str = C55717a.m101460a(displayId, lowerCase, str2, str);
                    m101640a(textView, C17867d.m33078a().getResources().getString(R.string.cbk) + displayId, str, 4);
                    textView.setVisibility(0);
                } else {
                    if (iMUser.getSearchType() == 2) {
                        str = C55717a.m101460a(iMUser.getContactName(), iMUser.getContactNamePinyin(), iMUser.getContactNameInitial(), str);
                        m101640a(textView, str2, str, 6);
                        textView.setVisibility(0);
                    }
                    textView.setVisibility(8);
                }
            } else if (TextUtils.isEmpty(iMUser.getRemarkName())) {
                if (!TextUtils.isEmpty(iMUser.getSignature())) {
                    textView.setText(iMUser.getSignature());
                    textView.setVisibility(0);
                }
                textView.setVisibility(8);
            } else {
                String string = C17867d.m33078a().getResources().getString(R.string.cfl, iMUser.getNickName());
                str = C55717a.m101460a(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str);
                m101640a(textView, string, str, 3);
                textView.setVisibility(0);
            }
            if (TextUtils.isEmpty(iMUser.getDisplayName())) {
                textView.setVisibility(8);
                return;
            }
            textView.setText(iMUser.getDisplayName());
            textView.setVisibility(0);
            m101640a(textView, iMUser.getDisplayName(), str, 0);
        } else if (TextUtils.isEmpty(iMUser.getDisplayName())) {
            textView.setVisibility(8);
        } else {
            textView.setText(iMUser.getDisplayName());
            textView.setVisibility(0);
        }
    }

    /* renamed from: a */
    protected static void m101640a(TextView textView, String str, String str2, int i) {
        textView.setText(C55726d.m101479a(C0643b.m2378c(textView.getContext(), R.color.al), str, str2, i));
    }
}
