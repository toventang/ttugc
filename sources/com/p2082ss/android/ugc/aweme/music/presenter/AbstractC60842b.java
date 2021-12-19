package com.p2082ss.android.ugc.aweme.music.presenter;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.music.p3468c.AbstractC60747a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.b */
public abstract class AbstractC60842b extends C39088c<AbstractC39085b<BaseResponse>, AbstractC60846d> {

    /* renamed from: a */
    protected int f138260a;

    /* renamed from: b */
    protected int f138261b;

    /* renamed from: c */
    protected Context f138262c;

    static {
        Covode.recordClassIndex(71430);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo98494d();

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        mo98494d();
        if (!Keva.getRepo("collect").getBoolean("first_favourite_success", false) && this.f138260a == 1) {
            Keva.getRepo("collect").storeBoolean("first_favourite_success", true);
        }
    }

    public AbstractC60842b(Context context) {
        this.f138262c = context;
        mo67838a(new AbstractC39085b<BaseResponse>() {
            /* class com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60842b.C608431 */

            static {
                Covode.recordClassIndex(71431);
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 3) {
                    return false;
                }
                return true;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean sendRequest(Object... objArr) {
                C1731i<BaseResponse> collectMusic;
                AbstractC60842b.this.f138261b = ((Integer) objArr[0]).intValue();
                final String str = (String) objArr[1];
                AbstractC60842b.this.f138260a = ((Integer) objArr[2]).intValue();
                if (AbstractC60842b.this.f138261b != 1 || (collectMusic = ChooseMusicApi.f84343a.collectMusic(str, AbstractC60842b.this.f138260a)) == null) {
                    return false;
                }
                collectMusic.mo5534a(new AbstractC1729g<BaseResponse, Void>() {
                    /* class com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60842b.C608431.C608441 */

                    static {
                        Covode.recordClassIndex(71432);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
                    @Override // p077b.AbstractC1729g
                    public final /* synthetic */ Void then(C1731i<BaseResponse> iVar) {
                        if (iVar.mo5544c() || iVar.mo5539b()) {
                            AbstractC60842b.this.mo57526a_(iVar.mo5546e());
                            return null;
                        }
                        AbstractC60747a h = MusicService.m81198m().mo69319h();
                        if (h != null) {
                            String str = str;
                            boolean z = true;
                            if (AbstractC60842b.this.f138260a != 1) {
                                z = false;
                            }
                            h.mo98166a(str, z);
                        }
                        AbstractC60842b.this.mo57528c();
                        return null;
                    }
                }, C1731i.f5564c, null);
                return true;
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        int i;
        if (this.f138262c != null) {
            if (this.f138260a == 1) {
                i = R.string.ah3;
            } else {
                i = R.string.a92;
            }
            new C79459a(this.f138262c).mo123050a(i).mo123053a();
        }
        if (this.f92287i != null) {
            ((AbstractC60846d) this.f92287i).mo62894a(exc);
        }
    }
}
