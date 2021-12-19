package com.p2082ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.account.p2244c.C31599a;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.app.p2322c.C33721c;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.experiment.C46792ci;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51754w;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service.IMAdapterServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.userservice.UserService;
import com.p2082ss.android.ugc.aweme.userservice.api.IUserService;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.o */
public final class C63849o extends C31599a<AbstractC39085b<FollowStatus>, AbstractC63854r> implements AbstractC51754w {

    /* renamed from: a */
    public int f144779a = -1;

    /* renamed from: b */
    public boolean f144780b;

    /* renamed from: c */
    public int f144781c = -1;

    /* renamed from: d */
    public String f144782d;

    static {
        Covode.recordClassIndex(75273);
    }

    public C63849o() {
        mo67838a(new AbstractC39085b<FollowStatus>() {
            /* class com.p2082ss.android.ugc.aweme.profile.presenter.C63849o.C638501 */

            static {
                Covode.recordClassIndex(75274);
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 12) {
                    return false;
                }
                return true;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean sendRequest(final Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                C63849o.this.f144782d = (String) objArr[0];
                C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
                    /* class com.p2082ss.android.ugc.aweme.profile.presenter.C63849o.C638501.CallableC638511 */

                    static {
                        Covode.recordClassIndex(75275);
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        FollowStatus followStatus;
                        Object[] objArr = objArr;
                        Aweme aweme = (Aweme) objArr[5];
                        String str = (String) objArr[6];
                        C63849o.this.f144779a = ((Integer) objArr[1]).intValue();
                        C63849o.this.f144780b = ((Boolean) objArr[11]).booleanValue();
                        C63849o.this.f144781c = ((Integer) objArr[9]).intValue();
                        try {
                            Object[] objArr2 = objArr;
                            String str2 = (String) objArr2[3];
                            if (objArr2.length >= 11) {
                                IUserService d = UserService.m138861d();
                                Object[] objArr3 = objArr;
                                int intValue = ((Integer) objArr3[1]).intValue();
                                int intValue2 = ((Integer) objArr[2]).intValue();
                                int a = C33721c.m69041a(str2);
                                Object[] objArr4 = objArr;
                                followStatus = d.mo123562a((String) objArr3[0], (String) objArr3[8], intValue, intValue2, a, (String) objArr4[4], ((Integer) objArr4[7]).intValue(), "", (Map) objArr[10]);
                                if (followStatus != null) {
                                    followStatus.followerStatus = ((Integer) objArr[9]).intValue();
                                    followStatus.followFrom = ((Integer) objArr[2]).intValue();
                                }
                            } else {
                                IUserService d2 = UserService.m138861d();
                                Object[] objArr5 = objArr;
                                int intValue3 = ((Integer) objArr5[1]).intValue();
                                int intValue4 = ((Integer) objArr[2]).intValue();
                                int a2 = C33721c.m69041a(str2);
                                Object[] objArr6 = objArr;
                                followStatus = d2.mo123562a((String) objArr5[0], "", intValue3, intValue4, a2, (String) objArr6[4], ((Integer) objArr6[7]).intValue(), "", (Map) objArr[9]);
                            }
                            C638501.m115543a(((Integer) objArr[1]).intValue(), aweme, str, followStatus);
                            return followStatus;
                        } catch (C34485a e) {
                            if (e.getErrorCode() == 2149 && C37699a.m76222Y(aweme)) {
                                C638501.m115543a(((Integer) objArr[1]).intValue(), aweme, str, new FollowStatus((String) objArr[0], 0, e.getErrorCode()));
                            }
                            throw e;
                        }
                    }
                }, 0);
                return true;
            }

            /* renamed from: a */
            public static void m115543a(int i, Aweme aweme, String str, FollowStatus followStatus) {
                if (str != null) {
                    int i2 = 1;
                    if (i == 1 && C37699a.m76222Y(aweme)) {
                        str.hashCode();
                        int i3 = 0;
                        if (str.equals("homepage")) {
                            C38000g.m77050a().mo65888b(C17867d.m33078a(), aweme, followStatus);
                            C18129a.C18130a a = C18129a.m33746a("homepage_ad", "follow", aweme.getAwemeRawAd());
                            if (followStatus != null && followStatus.isCheating()) {
                                i3 = 1;
                            }
                            C18129a.C18130a a2 = a.mo28897a("is_cheated_follow", Integer.valueOf(i3));
                            if (followStatus != null) {
                                i2 = followStatus.followStatus;
                            }
                            a2.mo28897a("follow_status", Integer.valueOf(i2)).mo28902c();
                        } else if (str.equals("feed")) {
                            C38000g.m77050a().mo65879a(C17867d.m33078a(), aweme, followStatus);
                            C18129a.C18130a a3 = C18129a.m33746a("draw_ad", "follow", aweme.getAwemeRawAd());
                            if (followStatus != null && followStatus.isCheating()) {
                                i3 = 1;
                            }
                            C18129a.C18130a a4 = a3.mo28897a("is_cheated_follow", Integer.valueOf(i3));
                            if (followStatus != null) {
                                i2 = followStatus.followStatus;
                            }
                            a4.mo28897a("follow_status", Integer.valueOf(i2)).mo28902c();
                        }
                    }
                }
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.account.p2244c.C31599a
    /* renamed from: c */
    public final void mo57528c() {
        T t;
        T t2 = null;
        if (this.f92286h == null) {
            t = null;
        } else {
            t = this.f92286h.mData;
        }
        AbstractC63854r rVar = (AbstractC63854r) this.f92287i;
        if (this.f92286h != null) {
            t2 = this.f92286h.mData;
        }
        rVar.mo71321c(t2);
        if (t != null) {
            if (t.followStatus == 1) {
                MainServiceImpl.createIMainServicebyMonsterPlugin(false).trackAppsFlyerEvent("mus_af_follow", t.userId);
            }
            User user = new User();
            user.setUid(t.userId);
            user.setSecUid(t.secUserId);
            user.setFollowStatus(t.followStatus);
            user.setFollowerStatus(t.followerStatus);
            IMAdapterServiceImpl.m101068d().mo90128a(user);
        }
        if (!C46792ci.m90137a()) {
            m115537a((FollowStatus) t);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51754w
    /* renamed from: a */
    public final /* synthetic */ void mo87468a(AbstractC63854r rVar) {
        super.mo67839a_(rVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.account.p2244c.C31599a
    /* renamed from: a */
    public final boolean mo57616a(Object... objArr) {
        return super.mo57616a(objArr);
    }

    /* renamed from: a */
    private void m115537a(FollowStatus followStatus) {
        if (followStatus != null && this.f92287i != null) {
            ((AbstractC63854r) this.f92287i).mo71320b(followStatus);
            new FollowStatusEvent(followStatus).post();
            UserService.m138861d().mo123566b().postValue(followStatus);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        if (this.f92287i != null) {
            int i = 1;
            if (C33615a.m68844a(exc) != null) {
                int i2 = this.f144779a;
                if (i2 == 1) {
                    RuntimeBehaviorServiceImpl.m94812c().mo85866a("follow_user", String.valueOf(C33615a.m68844a(exc).getErrorCode()));
                } else if (i2 == 0) {
                    RuntimeBehaviorServiceImpl.m94812c().mo85866a("unfollow_user", String.valueOf(C33615a.m68844a(exc).getErrorCode()));
                }
            }
            ((AbstractC63854r) this.f92287i).mo71322d_(exc);
            String str = this.f144782d;
            FollowStatus followStatus = new FollowStatus();
            followStatus.userId = str;
            if (this.f144779a != 0) {
                i = 0;
            } else if (this.f144780b) {
                i = 4;
            } else if (this.f144781c == 1) {
                i = 2;
            }
            followStatus.followStatus = i;
            followStatus.followerStatus = this.f144781c;
            followStatus.isFollowSucess = false;
            new FollowStatusEvent(followStatus).post();
            UserService.m138861d().mo123566b().postValue(followStatus);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r8 != null) goto L_0x002b;
     */
    @Override // com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51754w
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87469a(com.p2082ss.android.ugc.aweme.profile.presenter.C63847n r8) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.presenter.C63849o.mo87469a(com.ss.android.ugc.aweme.profile.presenter.n):boolean");
    }
}
