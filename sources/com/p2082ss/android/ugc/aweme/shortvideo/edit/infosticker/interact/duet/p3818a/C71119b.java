package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.p3818a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.C34602l;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetStickerRecommendViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.b */
public final class C71119b extends RecyclerView.AbstractC1350a<C71120a> {

    /* renamed from: a */
    public LinkedHashSet<User> f159295a;

    /* renamed from: b */
    public AbstractC89171a<C89391z> f159296b;

    /* renamed from: c */
    public boolean f159297c;

    /* renamed from: d */
    public DuetStickerRecommendViewModel f159298d;

    /* renamed from: e */
    public AbstractC89183m<? super User, ? super Boolean, C89391z> f159299e;

    /* renamed from: f */
    public List<String> f159300f;

    /* renamed from: g */
    public ArrayList<User> f159301g;

    static {
        Covode.recordClassIndex(83625);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C71120a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m125699a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f159301g.size();
    }

    public /* synthetic */ C71119b() {
        this(new ArrayList());
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.b$a */
    public final class C71120a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final C71118a f159302a;

        /* renamed from: b */
        final /* synthetic */ C71119b f159303b;

        static {
            Covode.recordClassIndex(83626);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.b$a$a */
        static final class View$OnClickListenerC71121a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C71120a f159304a;

            static {
                Covode.recordClassIndex(83627);
            }

            View$OnClickListenerC71121a(C71120a aVar) {
                this.f159304a = aVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC89171a<C89391z> aVar = this.f159304a.f159303b.f159296b;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

        /* renamed from: a */
        public final boolean mo112423a(User user) {
            C89219l.m154721d(user, "");
            Iterator<User> it = this.f159303b.f159295a.iterator();
            while (it.hasNext()) {
                User next = it.next();
                String secUid = user.getSecUid();
                C89219l.m154716b(next, "");
                if (C89219l.m154714a((Object) secUid, (Object) next.getSecUid())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.b$a$b */
        static final class View$OnClickListenerC71122b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C71120a f159305a;

            /* renamed from: b */
            final /* synthetic */ User f159306b;

            /* renamed from: c */
            final /* synthetic */ C71118a f159307c;

            static {
                Covode.recordClassIndex(83628);
            }

            View$OnClickListenerC71122b(C71120a aVar, User user, C71118a aVar2) {
                this.f159305a = aVar;
                this.f159306b = user;
                this.f159307c = aVar2;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f159305a.f159303b.f159300f.contains(this.f159306b.getUid())) {
                    new C23144b(this.f159305a.f159302a).mo37640e(R.string.d23).mo37637b();
                } else if (!this.f159305a.f159303b.f159297c || this.f159307c.getCheckBox().isChecked()) {
                    if (this.f159307c.getCheckBox().isChecked()) {
                        this.f159307c.getCheckBox().setChecked(false);
                        Iterator<User> it = this.f159305a.f159303b.f159295a.iterator();
                        C89219l.m154716b(it, "");
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            User next = it.next();
                            C89219l.m154716b(next, "");
                            if (C89219l.m154714a((Object) next.getSecUid(), (Object) this.f159306b.getSecUid())) {
                                it.remove();
                                break;
                            }
                        }
                        if (this.f159305a.f159303b.f159295a.size() == 29) {
                            this.f159305a.f159303b.f159297c = false;
                            this.f159305a.f159303b.notifyDataSetChanged();
                        }
                    } else {
                        this.f159307c.getCheckBox().setChecked(true);
                        this.f159305a.f159303b.f159295a.add(this.f159306b);
                        if (this.f159305a.f159303b.f159295a.size() == 30) {
                            this.f159305a.f159303b.f159297c = true;
                            this.f159305a.f159303b.notifyDataSetChanged();
                        }
                        AbstractC89183m<? super User, ? super Boolean, C89391z> mVar = this.f159305a.f159303b.f159299e;
                        if (mVar != null) {
                            mVar.invoke(this.f159306b, true);
                        }
                    }
                    DuetStickerRecommendViewModel duetStickerRecommendViewModel = this.f159305a.f159303b.f159298d;
                    if (duetStickerRecommendViewModel != null) {
                        duetStickerRecommendViewModel.mo112412a(this.f159305a.f159303b.f159295a);
                    }
                } else {
                    new C23144b(this.f159305a.f159302a).mo37640e(R.string.be1).mo37637b();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71120a(C71119b bVar, C71118a aVar) {
            super(aVar);
            C89219l.m154721d(aVar, "");
            this.f159303b = bVar;
            this.f159302a = aVar;
        }
    }

    private C71119b(ArrayList<User> arrayList) {
        C89219l.m154721d(arrayList, "");
        this.f159301g = arrayList;
        this.f159295a = new LinkedHashSet<>();
        this.f159300f = new ArrayList();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C71120a aVar, int i) {
        C34602l lVar;
        C71120a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        if (i == this.f159301g.size() - 1) {
            aVar2.f159302a.setOnClickListener(new C71120a.View$OnClickListenerC71121a(aVar2));
            C71118a aVar3 = aVar2.f159302a;
            FrameLayout frameLayout = aVar3.f159294d;
            if (frameLayout == null) {
                C89219l.m154710a("checkLayout");
            }
            frameLayout.setVisibility(8);
            TuxTextView tuxTextView = aVar3.f159292b;
            if (tuxTextView == null) {
                C89219l.m154710a("userName");
            }
            Context context = aVar3.getContext();
            C89219l.m154716b(context, "");
            tuxTextView.setText(context.getResources().getString(R.string.d4k));
            C20766v a = C20761r.m39056a(2131230944);
            SmartCircleImageView smartCircleImageView = aVar3.f159291a;
            if (smartCircleImageView == null) {
                C89219l.m154710a("avatar");
            }
            a.f49092E = smartCircleImageView;
            a.mo34186c();
            return;
        }
        User user = this.f159301g.get(i);
        C89219l.m154716b(user, "");
        User user2 = user;
        C89219l.m154721d(user2, "");
        View view = aVar2.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.recycleView.DuetRecommendUserItemView");
        C71118a aVar4 = (C71118a) view;
        FrameLayout frameLayout2 = aVar4.f159294d;
        if (frameLayout2 == null) {
            C89219l.m154710a("checkLayout");
        }
        frameLayout2.setVisibility(0);
        aVar2.itemView.setOnClickListener(new C71120a.View$OnClickListenerC71122b(aVar2, user2, aVar4));
        UrlModel avatarThumb = user2.getAvatarThumb();
        if (avatarThumb == null) {
            lVar = null;
        } else {
            lVar = new C34602l(avatarThumb.getUri(), avatarThumb.getUrlList());
        }
        C20766v a2 = C20761r.m39060a(lVar);
        a2.f49092E = aVar4.getAvatar();
        a2.mo34186c();
        aVar4.getUserName().setText(user2.getNickname());
        aVar4.getCheckBox().setChecked(aVar2.mo112423a(user2));
        if ((!aVar2.f159303b.f159297c || aVar4.getCheckBox().isChecked()) && !aVar2.f159303b.f159300f.contains(user2.getUid())) {
            View rootView = aVar4.getRootView();
            C89219l.m154716b(rootView, "");
            rootView.setAlpha(1.0f);
            return;
        }
        View rootView2 = aVar4.getRootView();
        C89219l.m154716b(rootView2, "");
        rootView2.setAlpha(0.3f);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m125699a(C71119b bVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(9357);
        C89219l.m154721d(viewGroup, "");
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        C71120a aVar = new C71120a(bVar, new C71118a(context));
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar.getClass().getName();
        MethodCollector.m26664o(9357);
        return aVar;
    }
}
