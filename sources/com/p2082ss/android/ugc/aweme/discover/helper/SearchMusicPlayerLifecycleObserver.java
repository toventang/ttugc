package com.p2082ss.android.ugc.aweme.discover.helper;

import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.metrics.C59213ah;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.search.p3696l.EnumC67634k;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.view.ProgressDialogC74145d;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.SearchMusicPlayerLifecycleObserver */
public class SearchMusicPlayerLifecycleObserver implements AbstractC33974au {

    /* renamed from: a */
    public ActivityC0945e f97870a;

    /* renamed from: b */
    public MusicPlayHelper f97871b;

    /* renamed from: c */
    public ProgressDialogC74145d f97872c;

    /* renamed from: d */
    public AbstractC1214u f97873d = new AbstractC1214u<C42042o>() {
        /* class com.p2082ss.android.ugc.aweme.discover.helper.SearchMusicPlayerLifecycleObserver.C419641 */

        static {
            Covode.recordClassIndex(49894);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C42042o oVar) {
            C42042o oVar2 = oVar;
            if (oVar2 != null) {
                int i = oVar2.f98013a;
                if (i == 1) {
                    if (SearchMusicPlayerLifecycleObserver.this.f97872c == null) {
                        SearchMusicPlayerLifecycleObserver searchMusicPlayerLifecycleObserver = SearchMusicPlayerLifecycleObserver.this;
                        searchMusicPlayerLifecycleObserver.f97872c = ProgressDialogC74145d.m130371a(searchMusicPlayerLifecycleObserver.f97870a, SearchMusicPlayerLifecycleObserver.this.f97870a.getResources().getString(R.string.d_y));
                    }
                    SearchMusicPlayerLifecycleObserver.this.f97872c.setIndeterminate(false);
                } else if (i == 2) {
                    if (SearchMusicPlayerLifecycleObserver.this.f97872c == null) {
                        SearchMusicPlayerLifecycleObserver searchMusicPlayerLifecycleObserver2 = SearchMusicPlayerLifecycleObserver.this;
                        searchMusicPlayerLifecycleObserver2.f97872c = ProgressDialogC74145d.m130371a(searchMusicPlayerLifecycleObserver2.f97870a, SearchMusicPlayerLifecycleObserver.this.f97870a.getResources().getString(R.string.d_y));
                        SearchMusicPlayerLifecycleObserver.this.f97872c.setIndeterminate(false);
                    }
                    SearchMusicPlayerLifecycleObserver.this.f97872c.setProgress(oVar2.f98014b);
                } else if (i == 3) {
                    if (SearchMusicPlayerLifecycleObserver.this.f97872c != null) {
                        SearchMusicPlayerLifecycleObserver.this.f97872c.setProgress(100);
                    }
                    SearchMusicPlayerLifecycleObserver.this.mo71134a();
                    if (oVar2.f98016d != null && !TextUtils.isEmpty(oVar2.f98016d.f97925a) && oVar2.f98016d.f97926b != null) {
                        SearchMusicPlayerLifecycleObserver searchMusicPlayerLifecycleObserver3 = SearchMusicPlayerLifecycleObserver.this;
                        String str = oVar2.f98016d.f97925a;
                        MusicModel musicModel = oVar2.f98016d.f97926b;
                        C59213ah.f134852a = "search_result";
                        AVExternalServiceImpl.m113114a().asyncService("SearchMusic", new SimpleServiceLoadCallback(new RecordConfig.Builder().shootWay("search_music").translationType(3).musicPath(str).musicOrigin("search_result").build(), musicModel) {
                            /* class com.p2082ss.android.ugc.aweme.discover.helper.SearchMusicPlayerLifecycleObserver.C419652 */

                            /* renamed from: a */
                            final /* synthetic */ RecordConfig f97875a;

                            /* renamed from: b */
                            final /* synthetic */ MusicModel f97876b;

                            static {
                                Covode.recordClassIndex(49895);
                            }

                            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                            public final void onLoad(AsyncAVService asyncAVService, long j) {
                                asyncAVService.uiService().recordService().startRecord(SearchMusicPlayerLifecycleObserver.this.f97870a, this.f97875a, this.f97876b, false);
                            }

                            {
                                this.f97875a = r2;
                                this.f97876b = r3;
                            }
                        });
                    }
                } else if (i == 4) {
                    SearchMusicPlayerLifecycleObserver.this.mo71134a();
                    if (oVar2.f98015c > 0) {
                        new C79459a(SearchMusicPlayerLifecycleObserver.this.f97870a).mo123050a(oVar2.f98015c).mo123053a();
                    }
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(49893);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: a */
    public final void mo71134a() {
        ProgressDialogC74145d dVar = this.f97872c;
        if (dVar != null) {
            dVar.dismiss();
        }
        this.f97872c = null;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public void onCreate() {
        EnumC67634k.INSTANCE.async(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.discover.helper.SearchMusicPlayerLifecycleObserver.RunnableC419663 */

            static {
                Covode.recordClassIndex(49896);
            }

            public final void run() {
                SearchMusicPlayerLifecycleObserver searchMusicPlayerLifecycleObserver = SearchMusicPlayerLifecycleObserver.this;
                searchMusicPlayerLifecycleObserver.f97871b = (MusicPlayHelper) C1181ae.m3881a(searchMusicPlayerLifecycleObserver.f97870a, (C1175ad.AbstractC1177b) null).mo3983a(MusicPlayHelper.class);
                SearchMusicPlayerLifecycleObserver.this.f97871b.f97853d.mo60213a(SearchMusicPlayerLifecycleObserver.this.f97870a, SearchMusicPlayerLifecycleObserver.this.f97873d, false);
            }
        });
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        mo71134a();
        MusicPlayHelper musicPlayHelper = this.f97871b;
        if (musicPlayHelper != null) {
            musicPlayHelper.f97853d.removeObserver(this.f97873d);
        }
    }

    public SearchMusicPlayerLifecycleObserver(ActivityC0945e eVar) {
        this.f97870a = eVar;
    }
}
