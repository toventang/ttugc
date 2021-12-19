package com.p2082ss.android.ugc.aweme.music;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47431e;
import com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.music.j */
public final class C60818j extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public TextView f138210a;

    /* renamed from: b */
    public TextView f138211b;

    /* renamed from: c */
    public RemoteImageView f138212c;

    /* renamed from: d */
    RelativeLayout f138213d;

    /* renamed from: e */
    ConstraintLayout f138214e;

    /* renamed from: f */
    public TuxIconView f138215f;

    /* renamed from: g */
    TextView f138216g;

    /* renamed from: h */
    LinearLayout f138217h;

    /* renamed from: i */
    public CheckableImageView f138218i;

    /* renamed from: j */
    ProgressBar f138219j;

    /* renamed from: k */
    public LinearLayout f138220k;

    /* renamed from: l */
    ImageView f138221l;

    /* renamed from: m */
    public TextView f138222m;

    /* renamed from: n */
    Barrier f138223n;

    /* renamed from: o */
    public MusicModel f138224o;

    /* renamed from: p */
    public boolean f138225p;

    /* renamed from: q */
    public Context f138226q;

    /* renamed from: r */
    String f138227r;

    /* renamed from: s */
    private AbstractC47431e f138228s;

    static {
        Covode.recordClassIndex(71375);
    }

    /* renamed from: a */
    public final void mo98225a() {
        int i;
        CheckableImageView checkableImageView = this.f138218i;
        if (this.f138225p) {
            i = 2131233382;
        } else {
            i = 2131233437;
        }
        checkableImageView.setImageResource(i);
    }

    /* renamed from: a */
    public final void mo98227a(boolean z) {
        if (z) {
            this.f138213d.setVisibility(0);
            this.f138215f.setVisibility(0);
            this.f138215f.setImageResource(2131233424);
            this.f138215f.clearAnimation();
            this.f138219j.setVisibility(8);
            C39162r.onEvent(MobClick.obtain().setEventName("music_play").setLabelName("personal_homepage_list").setValue(this.f138224o.getMusicId()));
            return;
        }
        this.f138213d.setVisibility(8);
        this.f138219j.setVisibility(8);
        this.f138215f.setVisibility(0);
        this.f138215f.setIconRes(R.raw.icon_color_play);
        this.f138215f.clearAnimation();
    }

    /* renamed from: a */
    public final void mo98226a(View view) {
        int id = view.getId();
        if (id == R.id.cno) {
            MusicModel musicModel = this.f138224o;
            if (musicModel != null && musicModel.getMusicStatus() == 0 && this.f138224o.getMusic() != null) {
                String offlineDesc = this.f138224o.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = this.f138226q.getString(R.string.dau);
                }
                new C79459a(view.getContext()).mo123052a(offlineDesc).mo123053a();
                return;
            } else if (this.f138224o != null) {
                C39162r.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("personal_homepage_list").setValue(this.f138224o.getMusicId()));
                String uuid = UUID.randomUUID().toString();
                C39162r.m79460a("enter_music_detail", new C33744d().mo59983a("enter_from", "personal_homepage_list").mo59983a("group_id", "").mo59983a("music_id", this.f138224o.getMusicId()).mo59983a("previous_page", this.f138227r).mo59983a("process_id", uuid).mo59983a("enter_method", "personal_list").f79943a);
                if (!MusicService.m81198m().mo69308a(this.f138224o, this.itemView.getContext(), true)) {
                    C39162r.m79460a("enter_music_detail_failed", new C33744d().mo59983a("group_id", "").mo59983a("author_id", "").mo59983a("music_id", this.f138224o.getMusicId()).mo59983a("enter_from", "personal_homepage_list").f79943a);
                    return;
                }
                C36125t.m73598a(C36125t.m73591a(), C36131u.m73602a("aweme://music/detail/" + this.f138224o.getMusicId()).mo63248a("process_id", uuid).mo63249a());
            }
        } else if (id == R.id.dlk) {
            this.f138215f.clearAnimation();
            this.f138215f.setIconRes(R.raw.icon_color_play);
        }
        AbstractC47431e eVar = this.f138228s;
        if (eVar != null) {
            eVar.mo79580a(this, view, this.f138224o);
        }
    }

    public C60818j(View view, AbstractC47431e eVar, String str) {
        super(view);
        this.f138228s = eVar;
        this.f138227r = str;
        this.f138210a = (TextView) view.findViewById(R.id.ezz);
        this.f138211b = (TextView) view.findViewById(R.id.evh);
        this.f138212c = (RemoteImageView) view.findViewById(R.id.dqg);
        this.f138213d = (RelativeLayout) view.findViewById(R.id.dlk);
        this.f138214e = (ConstraintLayout) view.findViewById(R.id.dlv);
        this.f138215f = (TuxIconView) view.findViewById(R.id.bzx);
        this.f138216g = (TextView) view.findViewById(R.id.f8l);
        this.f138217h = (LinearLayout) view.findViewById(R.id.ceu);
        this.f138218i = (CheckableImageView) view.findViewById(R.id.bxo);
        this.f138219j = (ProgressBar) view.findViewById(R.id.d01);
        this.f138220k = (LinearLayout) view.findViewById(R.id.cns);
        this.f138221l = (ImageView) view.findViewById(R.id.cno);
        this.f138222m = (TextView) view.findViewById(R.id.f6s);
        this.f138223n = (Barrier) view.findViewById(R.id.qs);
        View findViewById = view.findViewById(R.id.dlk);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC60821k(this));
        }
        View findViewById2 = view.findViewById(R.id.ceu);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View$OnClickListenerC60832l(this));
        }
        View findViewById3 = view.findViewById(R.id.cno);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new View$OnClickListenerC60834m(this));
        }
        this.f138226q = view.getContext();
        this.f138218i.setOnStateChangeListener(new CheckableImageView.AbstractC61078a() {
            /* class com.p2082ss.android.ugc.aweme.music.C60818j.C608191 */

            static {
                Covode.recordClassIndex(71376);
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
            public final void bX_() {
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
            /* renamed from: a */
            public final void mo62594a(int i) {
                if (i == 1) {
                    C60818j.this.mo98225a();
                }
            }
        });
        this.f138218i.setVisibility(0);
        this.f138223n.setReferencedIds(new int[]{R.id.bxo, R.id.bxt});
    }
}
