package com.p2082ss.android.ugc.aweme.music.p3465b;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47431e;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47432f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.music.C60818j;
import com.p2082ss.android.ugc.aweme.music.View$OnClickListenerC60835n;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.b.l */
public final class C60732l extends AbstractC39063h {

    /* renamed from: a */
    public AbstractC47432f f138011a;

    /* renamed from: b */
    public int f138012b = -1;

    /* renamed from: c */
    public RecyclerView f138013c;

    /* renamed from: d */
    public List<MusicModel> f138014d = new ArrayList();

    /* renamed from: e */
    public String f138015e;

    /* renamed from: f */
    public int f138016f;

    /* renamed from: g */
    public String f138017g;

    /* renamed from: h */
    private AbstractC47431e f138018h = new AbstractC47431e() {
        /* class com.p2082ss.android.ugc.aweme.music.p3465b.C60732l.C607342 */

        static {
            Covode.recordClassIndex(71290);
        }

        /* renamed from: a */
        private static boolean m110268a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47431e
        /* renamed from: a */
        public final void mo79580a(RecyclerView.ViewHolder viewHolder, View view, MusicModel musicModel) {
            String str;
            if (musicModel != null && view != null && view.getContext() != null) {
                if (view.getId() == R.id.dlk) {
                    if (MusicService.m81198m().mo69308a(musicModel, view.getContext(), true)) {
                        if (!C31575b.m65865g().isLogin() && AVExternalServiceImpl.m113114a().configService().avsettingsConfig().needLoginBeforeRecord()) {
                            AbstractC34892bo b = C31575b.m65860b();
                            IAccountService.C31274d dVar = new IAccountService.C31274d();
                            dVar.f74960a = (Activity) view.getContext();
                            b.showLoginAndRegisterView(dVar.mo57084a());
                            C39162r.onEvent(MobClick.obtain().setEventName("login_notify").setLabelName("click_music_shoot"));
                        } else if (C60732l.this.f138011a != null) {
                            C60732l.this.f138011a.mo79705a(musicModel, viewHolder.getLayoutPosition(), false);
                            MobClick value = MobClick.obtain().setEventName("shoot").setLabelName("single_song").setValue(musicModel.getMusicId());
                            C33743c cVar = new C33743c();
                            if (TextUtils.equals(C31575b.m65865g().getCurUserId(), C60732l.this.f138015e)) {
                                str = "personal_homepage";
                            } else {
                                str = "others_homepage";
                            }
                            C39162r.onEvent(value.setJsonObject(cVar.mo59976a("enter_from", str).mo59977a()));
                            C39162r.m79460a("shoot", new C33744d().mo59983a("shoot_way", "single_song").mo59983a("music_id", musicModel.getMusicId()).f79943a);
                        }
                    }
                } else if (view.getId() == R.id.ceu) {
                    C39162r.m79460a("play_music", new C33744d().mo59983a("enter_from", "personal_homepage_list").mo59983a("previous_page", C60732l.this.f138017g).mo59983a("music_id", musicModel.getMusicId()).mo59983a("enter_method", "personal_list").f79943a);
                    view.getContext();
                    if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                        C58029j.f132256h = m110268a();
                    }
                    if (!C58029j.f132256h) {
                        new C79459a(view.getContext()).mo123050a(R.string.dcq).mo123053a();
                    } else if (C60732l.this.f138012b == viewHolder.getAdapterPosition()) {
                        if (C60732l.this.f138011a != null) {
                            C60732l.this.mo63369e();
                        }
                    } else if (C60732l.this.f138011a != null) {
                        C60732l.this.mo63369e();
                        C60732l.this.f138012b = viewHolder.getAdapterPosition();
                        C60732l.this.f138011a.mo79704a(musicModel);
                    }
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(71288);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60933c() {
        return this.f138014d.size();
    }

    /* renamed from: e */
    public final void mo63369e() {
        int i = this.f138012b;
        if (i != -1) {
            RecyclerView.ViewHolder f = this.f138013c.mo4451f(i);
            if (f instanceof C60818j) {
                ((C60818j) f).mo98227a(false);
            }
            this.f138012b = -1;
        }
        this.f138011a.mo79703a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f138013c = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f138013c = null;
    }

    /* renamed from: a */
    public final void mo98156a(List<MusicModel> list) {
        this.f138014d.clear();
        this.f138014d.addAll(list);
        notifyDataSetChanged();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        return super.mo60936c(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        return new C60818j(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ao1, viewGroup, false), this.f138018h, this.f138017g);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        String str;
        if (viewHolder instanceof C60818j) {
            C60818j jVar = (C60818j) viewHolder;
            MusicModel musicModel = this.f138014d.get(i);
            int i2 = 0;
            if (i == this.f138012b) {
                z = true;
            } else {
                z = false;
            }
            if (musicModel != null) {
                jVar.f138224o = musicModel;
                jVar.f138220k.setBackground(C0643b.m2369a(jVar.f138220k.getContext(), (int) R.drawable.qa));
                if (!TextUtils.isEmpty(jVar.f138224o.getName())) {
                    str = jVar.f138224o.getName();
                } else {
                    str = "";
                }
                jVar.f138210a.setText(str);
                jVar.f138224o.getMusic().isOriginMusic();
                jVar.f138210a.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                jVar.f138218i.setOnClickListener(new View$OnClickListenerC60835n(jVar));
                jVar.f138222m.setText(jVar.f138226q.getString(R.string.dm7, Integer.valueOf(jVar.f138224o.getUserCount())));
                if (C16048b.m29633a().mo25421a(true, "remove_15s_cap_music", true)) {
                    jVar.f138211b.setText(MusicService.m81198m().mo69296a(jVar.f138224o.getPresenterDuration()));
                    TextView textView = jVar.f138211b;
                    if (jVar.f138224o.getPresenterDuration() <= 0) {
                        i2 = 4;
                    }
                    textView.setVisibility(i2);
                } else {
                    jVar.f138211b.setText(MusicService.m81198m().mo69296a(jVar.f138224o.getDuration()));
                    TextView textView2 = jVar.f138211b;
                    if (jVar.f138224o.getDuration() <= 0) {
                        i2 = 4;
                    }
                    textView2.setVisibility(i2);
                }
                if (!TextUtils.isEmpty(jVar.f138224o.getPicPremium())) {
                    C34577e.m70608b(jVar.f138212c, jVar.f138224o.getPicPremium(), -1, -1);
                } else if (!TextUtils.isEmpty(jVar.f138224o.getPicBig())) {
                    C34577e.m70608b(jVar.f138212c, jVar.f138224o.getPicBig(), -1, -1);
                } else {
                    C34577e.m70591a(jVar.f138212c, 2131233384);
                }
                jVar.mo98227a(z);
                if (jVar.f138224o.getCollectionType() != null) {
                    jVar.f138225p = MusicModel.CollectionType.COLLECTED.equals(jVar.f138224o.getCollectionType());
                }
                jVar.mo98225a();
            }
        }
    }

    public C60732l(AbstractC47432f fVar, String str, String str2) {
        this.f138011a = fVar;
        this.f138015e = str;
        this.f138017g = str2;
        registerAdapterDataObserver(new RecyclerView.AbstractC1353c() {
            /* class com.p2082ss.android.ugc.aweme.music.p3465b.C60732l.C607331 */

            static {
                Covode.recordClassIndex(71289);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4655a() {
                C60732l lVar = C60732l.this;
                lVar.f138016f = lVar.getItemCount();
                C60732l.this.mo63369e();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: b */
            public final void mo4660b(int i, int i2) {
                C60732l lVar = C60732l.this;
                lVar.f138016f = lVar.getItemCount();
                C60732l.this.mo63369e();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: c */
            public final void mo4661c(int i, int i2) {
                C60732l lVar = C60732l.this;
                lVar.f138016f = lVar.getItemCount();
                C60732l.this.mo63369e();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4656a(int i, int i2) {
                C60732l lVar = C60732l.this;
                lVar.f138016f = lVar.getItemCount();
                C60732l.this.mo63369e();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4657a(int i, int i2, int i3) {
                C60732l lVar = C60732l.this;
                lVar.f138016f = lVar.getItemCount();
                C60732l.this.mo63369e();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4658a(int i, int i2, Object obj) {
                C60732l lVar = C60732l.this;
                lVar.f138016f = lVar.getItemCount();
                C60732l.this.mo63369e();
            }
        });
    }
}
