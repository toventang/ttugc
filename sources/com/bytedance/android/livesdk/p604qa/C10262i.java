package com.bytedance.android.livesdk.p604qa;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1214u;
import androidx.p053i.AbstractC1036i;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p215e.C3884b;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.paging.p224a.AbstractC3971b;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.C4079b;
import com.bytedance.android.live.design.widget.C4128c;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p378m.C5762c;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC10073p;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.model.message.C9676bi;
import com.bytedance.android.livesdk.model.message.C9677bj;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11207aa;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Collection;
import java.util.Iterator;
import p4560f.p4561a.p4565b.C88411a;

/* renamed from: com.bytedance.android.livesdk.qa.i */
public final class C10262i extends AbstractC3971b<C10188af> implements OnMessageListener {

    /* renamed from: j */
    public Boolean f24815j;

    /* renamed from: k */
    public boolean f24816k;

    /* renamed from: l */
    public Room f24817l;

    /* renamed from: m */
    public int f24818m = -1;

    /* renamed from: n */
    public DataChannel f24819n;

    /* renamed from: o */
    public String f24820o;

    /* renamed from: p */
    C10220at f24821p;

    static {
        Covode.recordClassIndex(11828);
    }

    /* renamed from: com.bytedance.android.livesdk.qa.i$e */
    class C10269e extends AbstractC3971b.C3978f {

        /* renamed from: a */
        public View f24835a;

        /* renamed from: c */
        private ViewGroup f24837c;

        /* renamed from: d */
        private PagingViewModel f24838d;

        static {
            Covode.recordClassIndex(11835);
        }

        @Override // com.bytedance.android.live.core.paging.p224a.AbstractC3971b.C3978f
        /* renamed from: a */
        public final void mo9351a() {
            this.f24838d.f10972b.observeForever(new AbstractC1214u<C3884b>() {
                /* class com.bytedance.android.livesdk.p604qa.C10262i.C10269e.C102701 */

                static {
                    Covode.recordClassIndex(11836);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(C3884b bVar) {
                    C3884b bVar2 = bVar;
                    if (bVar2 == null) {
                        return;
                    }
                    if (bVar2.mo9243a()) {
                        C10269e.this.f24835a.setVisibility(0);
                    } else {
                        C10269e.this.f24835a.setVisibility(8);
                    }
                }
            });
        }

        C10269e(View view, PagingViewModel pagingViewModel) {
            super(view);
            MethodCollector.m26663i(3);
            this.f24838d = pagingViewModel;
            this.f24837c = (ViewGroup) view.findViewById(R.id.cfj);
            LiveLoadingView liveLoadingView = new LiveLoadingView(view.getContext());
            this.f24835a = liveLoadingView;
            this.f24837c.addView(liveLoadingView);
            MethodCollector.m26664o(3);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.android.live.core.paging.p224a.AbstractC3971b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo9330a(C10188af afVar) {
        return afVar.f24694a.f23548c;
    }

    /* renamed from: b */
    public final void mo17058b(long j) {
        m18729a(-1, j);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C9677bj) {
            mo17057a(((C9677bj) iMessage).f23551a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.bytedance.android.live.core.paging.p224a.AbstractC3971b
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof C10271f) {
            ((C10271f) viewHolder).f24847h.mo142944a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.qa.i$d */
    public class C10268d extends AbstractC3971b.AbstractC3973a {

        /* renamed from: a */
        PagingViewModel f24833a;

        static {
            Covode.recordClassIndex(11834);
        }

        @Override // com.bytedance.android.live.core.paging.p224a.AbstractC3971b.AbstractC3973a
        /* renamed from: a */
        public final void mo9345a(boolean z) {
            this.itemView.findViewById(R.id.djd).setOnClickListener(new View$OnClickListenerC10272j(this));
        }

        public C10268d(View view, PagingViewModel<C10188af> pagingViewModel) {
            super(view);
            this.f24833a = pagingViewModel;
        }
    }

    @Override // com.bytedance.android.live.core.paging.p224a.AbstractC3971b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo9331a(ViewGroup viewGroup) {
        return new C10267c(viewGroup.getContext(), C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.bcr, viewGroup, false));
    }

    @Override // com.bytedance.android.live.core.paging.p224a.AbstractC3971b
    /* renamed from: c */
    public final RecyclerView.ViewHolder mo9342c(ViewGroup viewGroup) {
        return new C10265a(viewGroup.getContext(), C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.bcv, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo17057a(long j) {
        for (C10188af afVar : ((QuestionViewModel) ((AbstractC3971b) this).f10882a).f24655j.f24669l) {
            if (afVar.f24694a.f23546a == j) {
                m18729a(j, -1);
                return;
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.i$b */
    class C10266b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public View f24827a;

        static {
            Covode.recordClassIndex(11832);
        }

        public C10266b(View view) {
            super(view);
            this.f24827a = view.findViewById(R.id.b9q);
        }
    }

    protected C10262i(DataChannel dataChannel, String str) {
        super(new C1445j.AbstractC1451e<C10188af>() {
            /* class com.bytedance.android.livesdk.p604qa.C10262i.C102631 */

            static {
                Covode.recordClassIndex(11829);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
            /* renamed from: b */
            public final /* synthetic */ boolean mo4954b(C10188af afVar, C10188af afVar2) {
                return afVar.equals(afVar2);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo4953a(C10188af afVar, C10188af afVar2) {
                C10188af afVar3 = afVar;
                C10188af afVar4 = afVar2;
                if (afVar3.f24694a == null || afVar4.f24694a == null || afVar3.f24694a.f23546a != afVar4.f24694a.f23546a) {
                    return false;
                }
                return true;
            }
        });
        this.f24819n = dataChannel;
        this.f24820o = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.qa.i$f */
    public class C10271f extends RecyclerView.ViewHolder {

        /* renamed from: a */
        C9676bi f24840a;

        /* renamed from: b */
        Context f24841b;

        /* renamed from: c */
        View f24842c;

        /* renamed from: d */
        String f24843d = "QuestionVieHolder";

        /* renamed from: e */
        Boolean f24844e = false;

        /* renamed from: f */
        long f24845f;

        /* renamed from: g */
        boolean f24846g;

        /* renamed from: h */
        C88411a f24847h = new C88411a();

        static {
            Covode.recordClassIndex(11837);
        }

        /* renamed from: a */
        static void m18745a(User user, String str) {
            UserProfileEvent userProfileEvent = new UserProfileEvent(user);
            userProfileEvent.setClickUserPosition("qa_board");
            userProfileEvent.setClickModule(str);
            C6779a.m14563a().mo13053a(userProfileEvent);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo17061a(C10188af afVar, int i) {
            C10262i.this.f24818m = i;
            this.f24847h.mo142945a(((QAApi) C5805e.m12718a().mo11572a(QAApi.class)).startAnswer(C10262i.this.f24817l.getId(), this.f24840a.f23546a).mo143271a(new C11191f()).mo143254a(new C10283u(this, afVar), C10284v.f24872a));
        }

        C10271f(Context context, View view) {
            super(view);
            this.f24841b = context;
            this.f24842c = view;
        }

        /* renamed from: a */
        static void m18744a(ImageView imageView, TextView textView, int i, int i2, long j) {
            int i3;
            imageView.setBackgroundResource(i);
            textView.setText(C11207aa.m19863a(j));
            textView.setTextColor(C4079b.m9889a(textView, i2));
            if (j <= 0) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            textView.setVisibility(i3);
        }
    }

    @Override // com.bytedance.android.live.core.paging.p224a.AbstractC3971b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo9332a(ViewGroup viewGroup, int i) {
        if (i == -1091576148) {
            return new C10269e(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b7r, viewGroup, false), ((AbstractC3971b) this).f10882a);
        }
        if (i == -1091576149) {
            return new C10268d(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.bct, viewGroup, false), ((AbstractC3971b) this).f10882a);
        }
        return super.mo9332a(viewGroup, i);
    }

    @Override // com.bytedance.android.live.core.paging.p224a.AbstractC3971b
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo9340b(ViewGroup viewGroup, int i) {
        View view;
        if (i == 3) {
            return mo9331a(viewGroup);
        }
        if (i == 4) {
            return new C10266b(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.bcw, viewGroup, false));
        }
        if (this.f24815j.booleanValue() || this.f24816k) {
            view = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.bcu, viewGroup, false);
        } else {
            view = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.bcx, viewGroup, false);
        }
        return new C10271f(viewGroup.getContext(), view);
    }

    /* renamed from: a */
    private void m18729a(long j, long j2) {
        boolean z;
        QuestionViewModel questionViewModel = (QuestionViewModel) ((AbstractC3971b) this).f10882a;
        questionViewModel.mo17011a(this.f24817l, this.f24815j.booleanValue(), this.f24816k);
        AbstractC1036i a = mo3757a();
        Iterator it = a.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            C10188af afVar = (C10188af) it.next();
            C9676bi biVar = afVar.f24694a;
            if (!(biVar.f23546a == j || biVar.f23550e.getId() == j2)) {
                questionViewModel.f24655j.f24669l.add(afVar);
                if (afVar.f24694a.f23548c == 1) {
                    questionViewModel.f24655j.f24671n.add(afVar);
                }
                if (afVar.f24694a.f23548c == 0 || afVar.f24694a.f23548c == 2) {
                    questionViewModel.f24655j.f24670m.add(afVar);
                }
            }
        }
        if (C13603b.m24435a((Collection) questionViewModel.f24655j.f24671n) && C13603b.m24435a((Collection) questionViewModel.f24655j.f24670m)) {
            questionViewModel.f24655j.f24669l.clear();
            z = false;
        }
        mo3759a((AbstractC1036i) questionViewModel.f24655j.mo17012a(a.f3638f, z));
    }

    @Override // com.bytedance.android.live.core.paging.p224a.AbstractC3971b
    /* renamed from: b */
    public final void mo9341b(RecyclerView.ViewHolder viewHolder, int i) {
        super.mo9341b(viewHolder, i);
        if (viewHolder instanceof C10265a) {
            C10265a aVar = (C10265a) viewHolder;
            if (C10262i.this.f24815j.booleanValue()) {
                aVar.f24823a.setText(R.string.dzn);
                TextView textView = (TextView) aVar.f24824b.findViewById(R.id.bdx);
                ViewGroup viewGroup = (ViewGroup) aVar.f24824b.findViewById(R.id.be6);
                if (!C5762c.m12633b(C10262i.this.f24819n)) {
                    C10262i.this.m18730a(aVar.f24825c, textView, viewGroup);
                    textView.setVisibility(0);
                    return;
                }
                textView.setVisibility(8);
                return;
            }
            aVar.f24823a.setText(R.string.dzm);
        }
    }

    @Override // com.bytedance.android.live.core.paging.p224a.AbstractC3971b
    /* renamed from: a */
    public final void mo9333a(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        int i3;
        String str;
        int i4;
        C10188af afVar = (C10188af) mo3758a(i);
        if (viewHolder instanceof C10271f) {
            C10271f fVar = (C10271f) viewHolder;
            if (afVar != null && afVar.f24694a != null) {
                QuestionViewModel questionViewModel = (QuestionViewModel) ((AbstractC3971b) C10262i.this).f10882a;
                if (questionViewModel.f24655j.f24672o != null) {
                    ViewGroup viewGroup = (ViewGroup) fVar.f24842c.findViewById(R.id.jx);
                    if (((C10262i.this.f24815j.booleanValue() || C10262i.this.f24816k) && i == 1) || (!C10262i.this.f24815j.booleanValue() && i == 0)) {
                        C3941k.m9607a((HSImageView) fVar.f24842c.findViewById(R.id.agx), "tiktok_live_basic_resource", "current_question.webp");
                        viewGroup.setVisibility(0);
                        C10262i.this.f24818m = i;
                    } else {
                        viewGroup.setVisibility(8);
                    }
                }
                fVar.f24840a = afVar.f24694a;
                TextView textView = (TextView) fVar.f24842c.findViewById(R.id.csh);
                ImageView imageView = (ImageView) fVar.f24842c.findViewById(R.id.mc);
                TextView textView2 = (TextView) fVar.f24842c.findViewById(R.id.dcs);
                if (C10262i.this.f24815j.booleanValue() || C10262i.this.f24816k) {
                    ImageView imageView2 = (ImageView) fVar.f24842c.findViewById(R.id.cld);
                    if (C10262i.this.f24816k && fVar.f24840a.f23550e.getId() == C11115u.m19743a().mo17915b().mo13161c()) {
                        imageView2.setVisibility(8);
                    }
                    imageView2.setOnClickListener(new View$OnClickListenerC10273k(fVar, afVar));
                    if (C10262i.this.f24818m == i) {
                        fVar.f24842c.setBackgroundResource(R.drawable.c_k);
                    } else {
                        fVar.f24842c.setBackgroundResource(R.drawable.c_l);
                    }
                    fVar.f24842c.setOnClickListener(new View$OnClickListenerC10274l(fVar, questionViewModel, afVar, i));
                    TextView textView3 = (TextView) fVar.f24842c.findViewById(R.id.c8s);
                    long j = (long) ((int) afVar.f24695b);
                    textView3.setText(textView3.getContext().getResources().getQuantityString(R.plurals.fr, (int) j, ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).formatLikeNumber(j)));
                } else {
                    TextView textView4 = (TextView) fVar.f24842c.findViewById(R.id.c8m);
                    fVar.f24845f = afVar.f24695b;
                    textView4.setText(C11207aa.m19863a(fVar.f24845f));
                    if (fVar.f24845f <= 0) {
                        i4 = 4;
                    } else {
                        i4 = 0;
                    }
                    textView4.setVisibility(i4);
                    ImageView imageView3 = (ImageView) fVar.f24842c.findViewById(R.id.bep);
                    if (afVar.f24696c == 1) {
                        imageView3.setBackgroundResource(2131234847);
                        textView4.setTextColor(C4079b.m9889a(textView2, (int) R.attr.am9));
                        fVar.f24844e = true;
                    }
                    imageView3.setOnClickListener(new View$OnClickListenerC10279q(fVar, imageView3, textView4));
                    textView2.setOnLongClickListener(new View$OnLongClickListenerC10280r(fVar));
                }
                textView.setOnClickListener(new View$OnClickListenerC10281s(fVar));
                imageView.setOnClickListener(new View$OnClickListenerC10282t(fVar));
                textView.setText(C6581g.m14075a(fVar.f24840a.f23550e));
                if (fVar.f24840a.f23550e == null || fVar.f24840a.f23550e.getAvatarThumb() == null) {
                    C3951p.m9620a(imageView, 2131234742, imageView.getWidth(), imageView.getHeight());
                } else {
                    C7577g.m15571a(imageView, fVar.f24840a.f23550e.getAvatarThumb(), imageView.getWidth(), imageView.getHeight(), 2131234742);
                }
                View findViewById = fVar.f24842c.findViewById(R.id.q8);
                if (fVar.f24840a.f23550e == null || fVar.f24840a.f23550e.getUserAttr() == null || !fVar.f24840a.f23550e.getUserAttr().f23192b) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                findViewById.setVisibility(i3);
                Long valueOf = Long.valueOf((System.currentTimeMillis() / 1000) - fVar.f24840a.f23549d);
                if (valueOf.longValue() < 60) {
                    str = C3966y.m9657a((int) R.string.em_);
                } else if (valueOf.longValue() < 3600) {
                    str = (valueOf.longValue() / 60) + C3966y.m9657a((int) R.string.ede);
                } else if (valueOf.longValue() < 86400) {
                    str = (valueOf.longValue() / 1440) + C3966y.m9657a((int) R.string.e45);
                } else if (valueOf.longValue() < 604800) {
                    str = (valueOf.longValue() / 86400) + C3966y.m9657a((int) R.string.dy9);
                } else {
                    str = "1" + C3966y.m9657a((int) R.string.eny);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fVar.f24840a.f23547b);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) " ".concat(String.valueOf(str)));
                C4128c.m10031a(textView2.getContext(), spannableStringBuilder, 0, length, 3, 600);
                if (fVar.f24840a.f23548c == 1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(C4079b.m9889a(textView2, (int) R.attr.amn)), 0, length, 33);
                    imageView.setAlpha(0.5f);
                    textView.setTextColor(C4079b.m9889a(textView2, (int) R.attr.amn));
                } else {
                    textView.setTextColor(C4079b.m9889a(textView2, (int) R.attr.amt));
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(C4079b.m9889a(textView2, (int) R.attr.amm)), 0, length, 33);
                }
                int i5 = length + 1;
                C4128c.m10031a(textView2.getContext(), spannableStringBuilder, i5, spannableStringBuilder.length(), 3, 400);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(C4079b.m9889a(textView2, (int) R.attr.amn)), i5, spannableStringBuilder.length(), 33);
                textView2.setText(spannableStringBuilder);
            }
        } else if (viewHolder instanceof C10266b) {
            if (this.f24815j.booleanValue() || this.f24816k || i == 0) {
                ((C10266b) viewHolder).f24827a.setVisibility(8);
            }
        } else if (!(viewHolder instanceof C10267c)) {
        } else {
            if (this.f24815j.booleanValue() || this.f24816k) {
                C10267c cVar = (C10267c) viewHolder;
                if (C5762c.m12633b(C10262i.this.f24819n) || !C10262i.this.f24815j.booleanValue()) {
                    cVar.f24831c.setBackgroundResource(R.color.a1w);
                    if (C10262i.this.f24815j.booleanValue()) {
                        i2 = R.string.e3v;
                    } else {
                        i2 = R.string.eh8;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C3966y.m9657a(i2));
                    C4128c.m10031a(cVar.f24829a.getContext(), spannableStringBuilder2, 0, spannableStringBuilder2.length(), 5, 400);
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(C4079b.m9889a(cVar.f24829a, (int) R.attr.amt)), 0, spannableStringBuilder2.length(), 33);
                    cVar.f24829a.setText(spannableStringBuilder2);
                    return;
                }
                C10262i.this.m18730a(cVar.f24830b, cVar.f24829a, cVar.f24831c);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.i$a */
    class C10265a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f24823a;

        /* renamed from: b */
        View f24824b;

        /* renamed from: c */
        Context f24825c;

        static {
            Covode.recordClassIndex(11831);
        }

        public C10265a(Context context, View view) {
            super(view);
            this.f24824b = view;
            this.f24825c = context;
            this.f24823a = (TextView) view.findViewById(R.id.acq);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.qa.i$c */
    public class C10267c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f24829a;

        /* renamed from: b */
        Context f24830b;

        /* renamed from: c */
        ViewGroup f24831c;

        static {
            Covode.recordClassIndex(11833);
        }

        public C10267c(Context context, View view) {
            super(view);
            this.f24830b = context;
            this.f24829a = (TextView) view.findViewById(R.id.bdx);
            this.f24831c = (ViewGroup) view.findViewById(R.id.be6);
        }
    }

    /* renamed from: a */
    private void m18730a(Context context, TextView textView, ViewGroup viewGroup) {
        viewGroup.setBackgroundColor(C4079b.m9889a(viewGroup, (int) R.attr.ale));
        String a = C3966y.m9657a((int) R.string.emy);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a + " " + C3966y.m9657a((int) R.string.emx));
        spannableStringBuilder.setSpan(new ClickableSpan() {
            /* class com.bytedance.android.livesdk.p604qa.C10262i.C102642 */

            static {
                Covode.recordClassIndex(11830);
            }

            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }

            public final void onClick(View view) {
                AbstractC0952i iVar = (AbstractC0952i) C10262i.this.f24819n.mo28318b(C9021ao.class);
                if (iVar != null) {
                    new C10229ax().show(iVar, "HeaderViewHolder");
                }
            }
        }, a.length() + 1, spannableStringBuilder.length(), 33);
        C4128c.m10031a(context, spannableStringBuilder, a.length() + 1, spannableStringBuilder.length(), 5, 600);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C4079b.m9889a(textView, (int) R.attr.am9)), a.length() + 1, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
