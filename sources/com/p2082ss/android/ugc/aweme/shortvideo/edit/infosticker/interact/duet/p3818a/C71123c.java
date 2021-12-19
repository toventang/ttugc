package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.p3818a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.C34602l;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.aweme.search.model.C67684i;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetStickerSearchViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.C71367e;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73998bn;
import com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84926c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.c */
public final class C71123c extends AbstractC84926c {

    /* renamed from: a */
    public LinkedHashSet<User> f159308a = new LinkedHashSet<>();

    /* renamed from: b */
    public List<String> f159309b = new ArrayList();

    /* renamed from: c */
    public ArrayList<User> f159310c = new ArrayList<>();

    /* renamed from: d */
    public ArrayList<C67679e> f159311d = new ArrayList<>();

    /* renamed from: e */
    public boolean f159312e;

    /* renamed from: f */
    public DuetStickerSearchViewModel f159313f;

    /* renamed from: g */
    public AbstractC89183m<? super User, ? super Boolean, C89391z> f159314g;

    /* renamed from: h */
    public String f159315h = "";

    static {
        Covode.recordClassIndex(83629);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84932f
    /* renamed from: a */
    public final int mo112426a() {
        return this.f159310c.size() + this.f159311d.size();
    }

    /* renamed from: b */
    public final List<String> mo112430b() {
        String userId;
        ArrayList<User> arrayList = this.f159310c;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            String uid = it.next().getUid();
            if (uid != null) {
                arrayList2.add(uid);
            }
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList<C67679e> arrayList4 = this.f159311d;
        ArrayList arrayList5 = new ArrayList();
        Iterator<T> it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            C67684i iVar = it2.next().f151672g;
            if (!(iVar == null || (userId = iVar.getUserId()) == null)) {
                arrayList5.add(userId);
            }
        }
        return C89070n.m154572d((Collection) arrayList3, (Iterable) arrayList5);
    }

    /* renamed from: a */
    public final void mo112429a(String str) {
        C89219l.m154721d(str, "");
        this.f159315h = str;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.c$a */
    public final class C71124a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final C71126d f159316a;

        /* renamed from: b */
        final /* synthetic */ C71123c f159317b;

        static {
            Covode.recordClassIndex(83630);
        }

        /* renamed from: a */
        private static C34602l m125706a(UrlModel urlModel) {
            if (urlModel == null) {
                return null;
            }
            return new C34602l(urlModel.getUri(), urlModel.getUrlList());
        }

        /* renamed from: b */
        private boolean m125707b(User user) {
            C89219l.m154721d(user, "");
            Iterator<User> it = this.f159317b.f159308a.iterator();
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

        /* renamed from: a */
        public final void mo112431a(User user) {
            C89219l.m154721d(user, "");
            View view = this.itemView;
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.recycleView.DuetStickerSearchUserItemUserView");
            C71126d dVar = (C71126d) view;
            this.itemView.setOnClickListener(new View$OnClickListenerC71125a(this, user, dVar));
            C20766v a = C20761r.m39060a(m125706a(user.getAvatarThumb()));
            a.f49092E = dVar.getAvatar();
            a.mo34186c();
            dVar.getUserName().setText(C73998bn.m130142a(user));
            dVar.getNickName().setText(user.getNickname());
            dVar.getCheckBox().setChecked(m125707b(user));
            if ((!this.f159317b.f159312e || dVar.getCheckBox().isChecked()) && !this.f159317b.f159309b.contains(user.getUid())) {
                dVar.mo112434b();
            } else {
                dVar.mo112433a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.c$a$a */
        public static final class View$OnClickListenerC71125a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C71124a f159318a;

            /* renamed from: b */
            final /* synthetic */ User f159319b;

            /* renamed from: c */
            final /* synthetic */ C71126d f159320c;

            static {
                Covode.recordClassIndex(83631);
            }

            View$OnClickListenerC71125a(C71124a aVar, User user, C71126d dVar) {
                this.f159318a = aVar;
                this.f159319b = user;
                this.f159320c = dVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f159318a.f159317b.f159309b.contains(this.f159319b.getUid())) {
                    new C23144b(this.f159320c).mo37640e(R.string.d23).mo37637b();
                } else if (!this.f159318a.f159317b.f159312e || this.f159320c.getCheckBox().isChecked()) {
                    if (this.f159320c.getCheckBox().isChecked()) {
                        this.f159320c.getCheckBox().setChecked(false);
                        Iterator<User> it = this.f159318a.f159317b.f159308a.iterator();
                        C89219l.m154716b(it, "");
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            User next = it.next();
                            C89219l.m154716b(next, "");
                            if (C89219l.m154714a((Object) next.getSecUid(), (Object) this.f159319b.getSecUid())) {
                                it.remove();
                                break;
                            }
                        }
                        if (this.f159318a.f159317b.f159308a.size() == 29) {
                            this.f159318a.f159317b.f159312e = false;
                            this.f159318a.f159317b.notifyDataSetChanged();
                        }
                    } else {
                        this.f159320c.getCheckBox().setChecked(true);
                        this.f159318a.f159317b.f159308a.add(this.f159319b);
                        if (this.f159318a.f159317b.f159308a.size() == 30) {
                            this.f159318a.f159317b.f159312e = true;
                            this.f159318a.f159317b.notifyDataSetChanged();
                        }
                        AbstractC89183m<? super User, ? super Boolean, C89391z> mVar = this.f159318a.f159317b.f159314g;
                        if (mVar != null) {
                            mVar.invoke(this.f159319b, false);
                        }
                    }
                    DuetStickerSearchViewModel duetStickerSearchViewModel = this.f159318a.f159317b.f159313f;
                    if (duetStickerSearchViewModel != null) {
                        duetStickerSearchViewModel.mo112413a(this.f159318a.f159317b.f159308a);
                    }
                } else {
                    new C23144b(this.f159320c).mo37640e(R.string.be1).mo37637b();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71124a(C71123c cVar, C71126d dVar) {
            super(dVar);
            C89219l.m154721d(dVar, "");
            this.f159317b = cVar;
            this.f159316a = dVar;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84932f
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo112427a(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            C89219l.m154715b();
        }
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        return new C71124a(this, new C71126d(context));
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84932f
    /* renamed from: a */
    public final void mo112428a(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder != null) {
            if (i < this.f159310c.size()) {
                User user = this.f159310c.get(i);
                C89219l.m154716b(user, "");
                ((C71124a) viewHolder).mo112431a(user);
                return;
            }
            C71124a aVar = (C71124a) viewHolder;
            C67679e eVar = this.f159311d.get(i - this.f159310c.size());
            C89219l.m154716b(eVar, "");
            C67679e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            C67684i iVar = eVar2.f151672g;
            if (iVar != null) {
                aVar.mo112431a(C71367e.m126079a(iVar));
            }
        }
    }
}
