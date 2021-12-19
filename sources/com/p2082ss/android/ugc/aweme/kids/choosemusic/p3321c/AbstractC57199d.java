package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.AbstractC33936c;
import com.p2082ss.android.ugc.aweme.arch.C33933a;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.C57171a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a.C57174b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57191a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57192b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57238a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57261a;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57080c;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3306d.C57106a;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.AbstractC57135c;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.C57136d;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3312i.C57147c;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.c.d */
public abstract class AbstractC57199d<T> extends AbstractC34586a implements AbstractC1214u<C33942b>, C33933a.AbstractC33934a<T>, AbstractC57080c<C57192b>, AbstractC57135c, AbstractC57234b, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    protected C57261a f130274a;

    /* renamed from: b */
    protected MusicModel f130275b;

    /* renamed from: c */
    public boolean f130276c = true;

    /* renamed from: d */
    protected C57238a f130277d;

    /* renamed from: e */
    public DataCenter f130278e;

    /* renamed from: j */
    protected AbstractC33936c<T> f130279j;

    /* renamed from: k */
    protected int f130280k;

    /* renamed from: l */
    private C33933a f130281l;

    static {
        Covode.recordClassIndex(67104);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AbstractC33936c<T> mo94418b(View view);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo94420g() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(278, new RunnableC90250g(AbstractC57199d.class, "onMusicCollectEvent", C57106a.class, ThreadMode.POSTING, 0, true));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract int mo94422n();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract String mo94423o();

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.AbstractC57135c
    /* renamed from: h */
    public final MusicModel mo94283h() {
        return this.f130275b;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.AbstractC57135c
    /* renamed from: i */
    public final Activity mo94284i() {
        return getActivity();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.AbstractC57135c
    /* renamed from: j */
    public final boolean mo94285j() {
        return af_();
    }

    /* renamed from: k */
    public RecyclerView.AbstractC1350a mo94421k() {
        AbstractC33936c<T> cVar = this.f130279j;
        if (cVar != null) {
            return cVar.mo60179c();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C57261a aVar = this.f130274a;
        if (aVar != null) {
            aVar.mo94287a();
            this.f130274a.mo94297d();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C57261a aVar = this.f130274a;
        if (aVar != null) {
            aVar.f130080k = false;
        }
    }

    /* renamed from: l */
    private boolean mo62679l() {
        if (getActivity().getIntent() != null) {
            return getActivity().getIntent().getBooleanExtra("extra_beat_music_sticker", false);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: a */
    public void mo60168a() {
        this.f130277d = new C57238a(getContext(), this.f130278e);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: e */
    public DataCenter mo60172e() {
        if (this.f130278e == null) {
            this.f130278e = DataCenter.m69492a(C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null), this);
        }
        this.f130278e.mo60189a("music_collect_status", (AbstractC1214u<C33942b>) this).mo60189a("play_compeleted", (AbstractC1214u<C33942b>) this);
        return this.f130278e;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C57261a aVar = this.f130274a;
        if (aVar != null) {
            aVar.mo94287a();
            this.f130274a.f130080k = true;
        }
        RecyclerView.AbstractC1350a k = mo94421k();
        if (k instanceof C57174b) {
            ((C57174b) k).mo94375l();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b
    /* renamed from: a */
    public final void mo94415a(C57136d.AbstractC57141a aVar) {
        this.f130274a.f130077h = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: a */
    public final AbstractC33936c<T> mo60167a(View view) {
        if (this.f130279j == null) {
            this.f130279j = mo94418b(view);
        }
        return this.f130279j;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b
    /* renamed from: b */
    public final void mo94419b(MusicModel musicModel) {
        this.f130274a.f130078i = mo94423o();
        this.f130274a.mo94296c(musicModel, mo94422n(), mo62679l());
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 1;
        if (getArguments() != null) {
            i = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        }
        this.f130280k = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b
    /* renamed from: a */
    public final void mo94416a(MusicModel musicModel) {
        C57261a aVar = this.f130274a;
        if (aVar != null) {
            aVar.mo94287a();
        }
    }

    @AbstractC90264r(mo145423b = true)
    public void onMusicCollectEvent(C57106a aVar) {
        if (this.f130278e != null && aVar != null && "music_detail".equals(aVar.f130018c)) {
            this.f130278e.mo60191a("music_collect_status", new C57191a(0, aVar.f130016a, -1, -1, aVar.f130017b));
        }
    }

    /* renamed from: a */
    public void onChanged(C33942b bVar) {
        int i;
        int i2;
        MusicModel.CollectionType collectionType;
        if (bVar != null) {
            String str = bVar.f80277a;
            str.hashCode();
            if (str.equals("music_collect_status")) {
                C57191a aVar = (C57191a) bVar.mo60212a();
                AbstractC33936c<T> cVar = this.f130279j;
                if (!(cVar == null || cVar.mo60179c() == null)) {
                    List<T> e = this.f130279j.mo60179c().mo63369e();
                    if (C13603b.m24435a((Collection) e)) {
                        return;
                    }
                    if (aVar.f130231a == 1) {
                        if (e.size() > aVar.f130233c) {
                            this.f130279j.mo60179c().notifyItemChanged(aVar.f130233c);
                        }
                    } else if (aVar.f130233c == -1) {
                        String musicId = aVar.f130235e.getMusicId();
                        if (!C13603b.m24435a((Collection) e)) {
                            for (T t : e) {
                                if (t != null && C13627m.m24499a(t.getMusicId(), musicId)) {
                                    if (aVar.f130234d == 1) {
                                        collectionType = MusicModel.CollectionType.COLLECTED;
                                    } else {
                                        collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                                    }
                                    t.setCollectionType(collectionType);
                                    int indexOf = e.indexOf(t);
                                    if (indexOf >= 0 && indexOf < e.size() && mo94420g()) {
                                        this.f130279j.mo60179c().notifyItemChanged(indexOf);
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
                if (getUserVisibleHint()) {
                    if (aVar.f130231a == 1) {
                        if (aVar.f130234d == 1) {
                            i2 = R.string.ah3;
                        } else {
                            i2 = R.string.a92;
                        }
                        new C79459a(getActivity()).mo123050a(i2).mo123053a();
                        return;
                    }
                    if (aVar.f130234d == 1) {
                        i = R.string.ah8;
                    } else {
                        i = R.string.a93;
                    }
                    new C79459a(getActivity()).mo123050a(i).mo123053a();
                }
            } else if (str.equals("play_compeleted") && (mo94421k() instanceof C57174b)) {
                ((C57174b) mo94421k()).mo94375l();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57080c
    /* renamed from: a */
    public final /* synthetic */ void mo94240a(C57192b bVar) {
        C57192b bVar2 = bVar;
        String str = bVar2.f130237b;
        MusicModel musicModel = bVar2.f130236a;
        if ("follow_type".equals(str)) {
            this.f130277d.mo94456a(musicModel, musicModel.getMusicId(), 1, bVar2.f130238c, bVar2.f130239d);
        } else if ("unfollow_type".equals(str)) {
            this.f130277d.mo94456a(musicModel, musicModel.getMusicId(), 0, bVar2.f130238c, bVar2.f130239d);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f130281l == null) {
            this.f130281l = new C33933a(this);
        }
        this.f130281l.mo60166a(view);
        C57261a aVar = new C57261a(this, new C57261a.AbstractC57266a() {
            /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57199d.C572001 */

            static {
                Covode.recordClassIndex(67105);
            }

            @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57261a.AbstractC57266a
            /* renamed from: a */
            public final void mo94425a() {
                if (AbstractC57199d.this.f130275b != null) {
                    AbstractC57199d.this.f130278e.mo60191a("play_compeleted", AbstractC57199d.this.f130275b.getMusicId());
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57261a.AbstractC57266a
            /* renamed from: b */
            public final void mo94426b() {
                if (AbstractC57199d.this.f130275b != null) {
                    AbstractC57199d.this.f130278e.mo60191a("play_error", AbstractC57199d.this.f130275b.getMusicId());
                }
            }
        });
        this.f130274a = aVar;
        aVar.mo94295c();
        this.f130274a.mo94291b(this.f130280k);
        RecyclerView.AbstractC1350a k = mo94421k();
        if (k instanceof C57174b) {
            this.f130274a.f130432a = ((C57174b) k).f130185e;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b
    /* renamed from: a */
    public final void mo94417a(MusicModel musicModel, C57171a aVar) {
        this.f130275b = musicModel;
        if (this.f130276c) {
            this.f130274a.f130432a = aVar;
            this.f130274a.mo94288a(musicModel, mo94422n(), false);
            return;
        }
        this.f130274a.mo94296c(musicModel, mo94422n(), mo62679l());
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.ada, viewGroup, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.AbstractC57135c
    /* renamed from: a */
    public final void mo94282a(String str, MusicModel musicModel, String str2) {
        final ActivityC0945e activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            C57147c.m103543a(musicModel);
            AVExternalServiceImpl.m113114a().publishService().setCurMusic(musicModel, true, false);
            if (this.f130280k == 1) {
                final RecordConfig.Builder builder = new RecordConfig.Builder();
                builder.musicOrigin(str2).musicModel(musicModel).musicPath(str);
                AVExternalServiceImpl.m113114a().asyncService("BaseMuiscList", new SimpleServiceLoadCallback() {
                    /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57199d.C572012 */

                    static {
                        Covode.recordClassIndex(67106);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onLoad(AsyncAVService asyncAVService, long j) {
                        asyncAVService.uiService().recordService().startRecord(activity, builder.build());
                        activity.finish();
                    }
                });
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("path", str);
            intent.putExtra("music_model", musicModel);
            intent.putExtra("music_origin", str2);
            activity.setResult(-1, intent);
            activity.finish();
        }
    }
}
