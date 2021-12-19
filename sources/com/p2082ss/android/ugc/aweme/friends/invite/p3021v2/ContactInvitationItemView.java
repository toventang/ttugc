package com.p2082ss.android.ugc.aweme.friends.invite.p3021v2;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.LiveData;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.common.C39139k;
import com.p2082ss.android.ugc.aweme.emoji.widget.EmojiCompatTuxTextView;
import com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51538a;
import com.p2082ss.android.ugc.aweme.friends.invite.p3021v2.InvitationViewModel;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import com.p2082ss.android.ugc.aweme.friends.p3019i.C51536j;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.share.improve.C68963a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.ContactInvitationItemView */
public final class ContactInvitationItemView extends ConstraintLayout implements AbstractC51538a {

    /* renamed from: k */
    public static final C51543a f118785k = new C51543a((byte) 0);

    /* renamed from: g */
    public InvitationViewModel f118786g;

    /* renamed from: h */
    public Fragment f118787h;

    /* renamed from: i */
    public boolean f118788i;

    /* renamed from: j */
    public AbstractC89172b<? super String, C89391z> f118789j;

    /* renamed from: l */
    private final AbstractC89244h f118790l;

    /* renamed from: m */
    private C56520b f118791m;

    /* renamed from: n */
    private SparseArray f118792n;

    static {
        Covode.recordClassIndex(60809);
    }

    /* renamed from: b */
    public final View mo9603b(int i) {
        if (this.f118792n == null) {
            this.f118792n = new SparseArray();
        }
        View view = (View) this.f118792n.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118792n.put(i, findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    public final InvitedLifecycleCallback getInvitedLifecycle() {
        return (InvitedLifecycleCallback) this.f118790l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.ContactInvitationItemView$a */
    public static final class C51543a {
        static {
            Covode.recordClassIndex(60811);
        }

        private C51543a() {
        }

        public /* synthetic */ C51543a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.ContactInvitationItemView$b */
    static final class C51544b extends AbstractC89220m implements AbstractC89171a<InvitedLifecycleCallback> {

        /* renamed from: a */
        final /* synthetic */ ContactInvitationItemView f118794a;

        static {
            Covode.recordClassIndex(60812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51544b(ContactInvitationItemView contactInvitationItemView) {
            super(0);
            this.f118794a = contactInvitationItemView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ InvitedLifecycleCallback invoke() {
            return new InvitedLifecycleCallback(this.f118794a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51538a
    public final LiveData<Boolean> getOnLoading() {
        InvitationViewModel invitationViewModel = this.f118786g;
        if (invitationViewModel == null) {
            C89219l.m154710a("invitationVM");
        }
        return invitationViewModel.mo87089a();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51538a
    /* renamed from: a */
    public final void mo87037a() {
        Fragment fragment = this.f118787h;
        if (fragment == null) {
            C89219l.m154710a("fragment");
        }
        fragment.getLifecycle().mo4012a(getInvitedLifecycle());
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51538a
    /* renamed from: b */
    public final void mo9139b() {
        Fragment fragment = this.f118787h;
        if (fragment == null) {
            C89219l.m154710a("fragment");
        }
        fragment.getLifecycle().mo4013b(getInvitedLifecycle());
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.ContactInvitationItemView$InvitedLifecycleCallback */
    public static final class InvitedLifecycleCallback implements AbstractC33974au {

        /* renamed from: a */
        private final WeakReference<ContactInvitationItemView> f118793a;

        static {
            Covode.recordClassIndex(60810);
        }

        @Override // androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
                onResume();
            }
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
        public final void onResume() {
            ContactInvitationItemView contactInvitationItemView = this.f118793a.get();
            if (contactInvitationItemView != null && contactInvitationItemView.f118788i) {
                contactInvitationItemView.f118788i = false;
                TuxButton tuxButton = (TuxButton) contactInvitationItemView.mo9603b(R.id.y0);
                C89219l.m154716b(tuxButton, "");
                tuxButton.setEnabled(false);
                TuxButton tuxButton2 = (TuxButton) contactInvitationItemView.mo9603b(R.id.y0);
                C89219l.m154716b(tuxButton2, "");
                tuxButton2.setText(contactInvitationItemView.getResources().getString(R.string.clc));
                new C23144b(contactInvitationItemView).mo37640e(R.string.cl8).mo37637b();
                Fragment fragment = contactInvitationItemView.f118787h;
                if (fragment == null) {
                    C89219l.m154710a("fragment");
                }
                fragment.getLifecycle().mo4013b(contactInvitationItemView.getInvitedLifecycle());
            }
        }

        public InvitedLifecycleCallback(ContactInvitationItemView contactInvitationItemView) {
            C89219l.m154721d(contactInvitationItemView, "");
            this.f118793a = new WeakReference<>(contactInvitationItemView);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51538a
    public final void setOutClickListener(AbstractC89172b<? super String, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f118789j = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51538a
    /* renamed from: a */
    public final void mo87038a(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        this.f118787h = fragment;
        this.f118786g = InvitationViewModel.C51573a.m96080a(fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.ContactInvitationItemView$c */
    public static final class View$OnClickListenerC51545c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ContactInvitationItemView f118795a;

        /* renamed from: b */
        final /* synthetic */ String f118796b;

        /* renamed from: c */
        final /* synthetic */ AbstractC69581b f118797c;

        static {
            Covode.recordClassIndex(60813);
        }

        View$OnClickListenerC51545c(ContactInvitationItemView contactInvitationItemView, String str, AbstractC69581b bVar) {
            this.f118795a = contactInvitationItemView;
            this.f118796b = str;
            this.f118797c = bVar;
        }

        public final void onClick(final View view) {
            ClickAgent.onClick(view);
            InvitationViewModel invitationViewModel = this.f118795a.f118786g;
            if (invitationViewModel == null) {
                C89219l.m154710a("invitationVM");
            }
            Fragment fragment = this.f118795a.f118787h;
            if (fragment == null) {
                C89219l.m154710a("fragment");
            }
            invitationViewModel.mo87090a(new C39139k<>(fragment, new AbstractC89172b<InvitationViewModel.C51574b, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.invite.p3021v2.ContactInvitationItemView.View$OnClickListenerC51545c.C515461 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC51545c f118798a;

                static {
                    Covode.recordClassIndex(60814);
                }

                {
                    this.f118798a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(InvitationViewModel.C51574b bVar) {
                    InvitationViewModel.C51574b bVar2 = bVar;
                    C89219l.m154721d(bVar2, "");
                    ContactInvitationItemView contactInvitationItemView = this.f118798a.f118795a;
                    View view = view;
                    C89219l.m154716b(view, "");
                    Context context = view.getContext();
                    C89219l.m154716b(context, "");
                    String str = this.f118798a.f118796b;
                    C89219l.m154716b(str, "");
                    contactInvitationItemView.f118788i = C51536j.m96014a(context, str, bVar2.f118858b, R.string.cl7);
                    AbstractC89172b<? super String, C89391z> bVar3 = this.f118798a.f118795a.f118789j;
                    if (bVar3 != null) {
                        bVar3.invoke(bVar2.f118857a);
                    }
                    return C89391z.f203057a;
                }
            }, new AbstractC89172b<Throwable, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.invite.p3021v2.ContactInvitationItemView.View$OnClickListenerC51545c.C515472 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC51545c f118800a;

                static {
                    Covode.recordClassIndex(60815);
                }

                {
                    this.f118800a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Throwable th) {
                    new C23144b(this.f118800a.f118795a).mo37640e(R.string.cl7).mo37637b();
                    C39109f.m79401a("ContactInvitationItemView", "invite contact request text error!", th);
                    AbstractC89172b<? super String, C89391z> bVar = this.f118800a.f118795a.f118789j;
                    if (bVar != null) {
                        bVar.invoke("");
                    }
                    return C89391z.f203057a;
                }
            }), this.f118797c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51538a
    /* renamed from: a */
    public final void mo87039a(Friend friend) {
        C89219l.m154721d(friend, "");
        setUpView(friend);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ContactInvitationItemView(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11193);
        LayoutInflater.from(context).inflate(R.layout.a2_, this);
        setLayoutParams(new ConstraintLayout.C0547a(-1, -2));
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        Integer valueOf2 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics())));
        Resources system3 = Resources.getSystem();
        C89219l.m154709a((Object) system3, "");
        Integer valueOf3 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system3.getDisplayMetrics())));
        Resources system4 = Resources.getSystem();
        C89219l.m154709a((Object) system4, "");
        C23163i.m43660a((View) this, valueOf, valueOf2, valueOf3, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system4.getDisplayMetrics()))), false, 16);
        this.f118790l = C89250i.m154773a((AbstractC89171a) new C51544b(this));
        MethodCollector.m26664o(11193);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51538a
    /* renamed from: a */
    public final void mo87040a(C56520b bVar) {
        boolean z;
        C56520b bVar2;
        C89219l.m154721d(bVar, "");
        if (!C89219l.m154714a(this.f118791m, bVar)) {
            this.f118791m = bVar;
            if (bVar.f128860b != -1) {
                z = true;
            } else {
                z = false;
            }
            C56520b bVar3 = null;
            if (z) {
                FrameLayout frameLayout = (FrameLayout) mo9603b(R.id.ob);
                C89219l.m154716b(frameLayout, "");
                FrameLayout frameLayout2 = (FrameLayout) mo9603b(R.id.ob);
                C89219l.m154716b(frameLayout2, "");
                ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                layoutParams.width = bVar.f128860b;
                layoutParams.height = bVar.f128860b;
                frameLayout.setLayoutParams(layoutParams);
            }
            if (bVar.f128863e != -1) {
                bVar2 = bVar;
            } else {
                bVar2 = null;
            }
            if (bVar2 != null) {
                ((TuxTextView) mo9603b(R.id.ezz)).setTuxFont(bVar2.f128863e);
            }
            if (bVar.f128864f != -1) {
                ((TuxTextView) mo9603b(R.id.ezz)).mo37697a((float) bVar.f128864f);
            }
            if (bVar.f128865g != -1) {
                bVar3 = bVar;
            }
            if (bVar3 != null) {
                ((TuxTextView) mo9603b(R.id.f0g)).setTuxFont(bVar3.f128865g);
            }
            if (bVar.f128868j != -1) {
                TuxTextView tuxTextView = (TuxTextView) mo9603b(R.id.f0g);
                C89219l.m154716b(tuxTextView, "");
                if (tuxTextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    TuxTextView tuxTextView2 = (TuxTextView) mo9603b(R.id.f0g);
                    C89219l.m154716b(tuxTextView2, "");
                    TuxTextView tuxTextView3 = (TuxTextView) mo9603b(R.id.f0g);
                    C89219l.m154716b(tuxTextView3, "");
                    ViewGroup.LayoutParams layoutParams2 = tuxTextView3.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.topMargin = bVar.f128868j;
                    tuxTextView2.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    private final void setUpView(Friend friend) {
        TuxTextView tuxTextView = (TuxTextView) mo9603b(R.id.ezz);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(friend.getNickname());
        String socialName = friend.getSocialName();
        TuxTextView tuxTextView2 = (TuxTextView) mo9603b(R.id.f0g);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(socialName);
        if (friend.isInvited()) {
            TuxButton tuxButton = (TuxButton) mo9603b(R.id.y0);
            C89219l.m154716b(tuxButton, "");
            tuxButton.setEnabled(false);
            TuxButton tuxButton2 = (TuxButton) mo9603b(R.id.y0);
            C89219l.m154716b(tuxButton2, "");
            tuxButton2.setText(getResources().getString(R.string.clc));
        } else {
            TuxButton tuxButton3 = (TuxButton) mo9603b(R.id.y0);
            C89219l.m154716b(tuxButton3, "");
            tuxButton3.setEnabled(true);
            TuxButton tuxButton4 = (TuxButton) mo9603b(R.id.y0);
            C89219l.m154716b(tuxButton4, "");
            tuxButton4.setText(getResources().getString(R.string.clb));
        }
        String photoUri = friend.getPhotoUri();
        if (photoUri != null) {
            C20766v a = C20761r.m39061a(photoUri);
            a.f49092E = (SmartImageView) mo9603b(R.id.bsr);
            a.mo34186c();
            EmojiCompatTuxTextView emojiCompatTuxTextView = (EmojiCompatTuxTextView) mo9603b(R.id.ov);
            C89219l.m154716b(emojiCompatTuxTextView, "");
            emojiCompatTuxTextView.setVisibility(8);
        } else {
            String nickname = friend.getNickname();
            if (nickname != null && nickname.length() > 0) {
                String[] split = TextUtils.split(nickname, " ");
                C89219l.m154716b(split, "");
                ArrayList<String> arrayList = new ArrayList();
                for (String str : split) {
                    C89219l.m154716b(str, "");
                    Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                    if (C89361p.m154910b((CharSequence) str).toString().length() > 0) {
                        arrayList.add(str);
                    }
                }
                StringBuilder sb = new StringBuilder("");
                for (String str2 : arrayList) {
                    if (sb.length() < 2) {
                        C89219l.m154716b(str2, "");
                        if (str2.length() > 0) {
                            sb.append(Character.toUpperCase(str2.charAt(0)));
                        }
                    }
                }
                EmojiCompatTuxTextView emojiCompatTuxTextView2 = (EmojiCompatTuxTextView) mo9603b(R.id.ov);
                C89219l.m154716b(emojiCompatTuxTextView2, "");
                emojiCompatTuxTextView2.setText(sb.toString());
            }
            C20766v a2 = C20761r.m39056a((int) R.drawable.a9k);
            a2.f49092E = (SmartImageView) mo9603b(R.id.bsr);
            a2.mo34186c();
            EmojiCompatTuxTextView emojiCompatTuxTextView3 = (EmojiCompatTuxTextView) mo9603b(R.id.ov);
            C89219l.m154716b(emojiCompatTuxTextView3, "");
            emojiCompatTuxTextView3.setVisibility(0);
        }
        AbstractC69581b bVar = C68963a.C68964a.m121652a("sms", C17873f.m33102j());
        TuxButton tuxButton5 = (TuxButton) mo9603b(R.id.y0);
        C89219l.m154716b(tuxButton5, "");
        if (!(!tuxButton5.isEnabled() || bVar == null || bVar.mo109555c())) {
            ((TuxButton) mo9603b(R.id.y0)).setOnClickListener(new View$OnClickListenerC51545c(this, socialName, bVar));
        }
    }

    public /* synthetic */ ContactInvitationItemView(Context context, byte b) {
        this(context);
    }
}
