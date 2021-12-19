package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.video;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.video.C39986a;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49979o;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49981p;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.metrics.C59206ab;
import com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.video.ba */
final /* synthetic */ class C40016ba implements IPrivacyConfig.IPermissionPostCallback {

    /* renamed from: a */
    private final C39986a f94039a;

    static {
        Covode.recordClassIndex(47782);
    }

    C40016ba(C39986a aVar) {
        this.f94039a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionPostCallback
    public final void doPostData(int i) {
        String aid;
        C39986a aVar = this.f94039a;
        aVar.getContext();
        if (!C39986a.m80960e()) {
            aVar.mo69174c(R.string.dcp);
        } else if (aVar.f93984c != null) {
            int privateStatus = aVar.f93984c.getStatus().getPrivateStatus();
            if (i != 1 || !aVar.f93984c.isTop()) {
                aVar.mo69171a(i);
                aVar.f93983b.receivePermissionResult(i);
                if (!(i == privateStatus || aVar.f93984c == null)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("is_photo", C50545m.m94767d(aVar.f93984c) ? 1 : 0);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    MobClick labelName = MobClick.obtain().setEventName("scope_click").setLabelName("share_option");
                    if (aVar.f93984c == null) {
                        aid = "0";
                    } else {
                        aid = aVar.f93984c.getAid();
                    }
                    C39162r.onEvent(labelName.setValue(aid).setJsonObject(jSONObject));
                    C39986a.C399882 r5 = new C49981p(aVar.getActivity(), privateStatus, i) {
                        /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.video.C39986a.C399882 */

                        /* renamed from: a */
                        final /* synthetic */ int f94006a;

                        /* renamed from: b */
                        final /* synthetic */ int f94007b;

                        static {
                            Covode.recordClassIndex(47754);
                        }

                        @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.feed.p2969u.C49981p, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
                        /* renamed from: a_ */
                        public final void mo57526a_(Exception exc) {
                            super.mo57526a_(exc);
                            Throwable a = C33615a.m68845a((Throwable) exc);
                            if (a instanceof C34485a) {
                                C34480a aVar = (C34480a) a;
                                if (aVar.getErrorCode() == 2752) {
                                    C39986a.this.f93984c.getStatus().setPrivateStatus(this.f94006a);
                                    C39986a.this.f93982a.setPermission(this.f94006a, C39986a.m80954a(C39986a.this.f93984c), C39986a.m80955b(C39986a.this.f93984c));
                                    C39986a aVar2 = C39986a.this;
                                    if (aVar2.f93984c == null || aVar2.f93984c.getCommerceVideoAuthInfo() == null || aVar2.f93984c.getCommerceVideoAuthInfo().getAuthStatus() != 2) {
                                        C33615a.m68847a(C39986a.this.getContext(), (Exception) a, (int) R.string.d0y);
                                    }
                                    int i = this.f94007b;
                                    if (i == 2) {
                                        C59206ab.m108755a("promote_layer_show").mo96746b("content", "friend_only_fail").mo96746b("group_id", C39986a.this.f93984c.getAid()).mo96792f();
                                    } else if (i == 1) {
                                        C59206ab.m108755a("promote_layer_show").mo96746b("content", "private_fail").mo96746b("group_id", C39986a.this.f93984c.getAid()).mo96792f();
                                    }
                                } else if (aVar.getErrorCode() == 2756) {
                                    C39986a.this.f93984c.getStatus().setPrivateStatus(this.f94006a);
                                    C39986a.this.f93982a.setPermission(this.f94006a, C39986a.m80954a(C39986a.this.f93984c), C39986a.m80955b(C39986a.this.f93984c));
                                    C17197a.C17200a a2 = new C17197a.C17200a(C39986a.this.getContext()).mo27194b(R.string.eyr).mo27190a(R.string.b6k, DialogInterface$OnClickListenerC40018bc.f94041a, false);
                                    a2.f41067M = false;
                                    a2.mo27193a().mo27185c();
                                }
                            }
                        }

                        {
                            this.f94006a = r3;
                            this.f94007b = r4;
                        }
                    };
                    aVar.f93984c.getStatus().setPrivateStatus(i);
                    r5.mo67838a(new C49979o());
                    if (i == 2) {
                        aVar.mo69173b(2);
                        r5.mo85027a(aVar.f93984c, 2);
                        r5.f115310d = aVar.mo69179h();
                        r5.mo57616a(aVar.f93984c.getAid(), 3);
                    } else if (i == 1) {
                        aVar.mo69173b(1);
                        r5.mo85027a(aVar.f93984c, 1);
                        r5.f115310d = aVar.mo69179h();
                        r5.mo57616a(aVar.f93984c.getAid(), 2);
                        C39162r.onEvent(new MobClick().setEventName("private_permission").setLabelName("confirm").setValue(aVar.f93984c.getAid()));
                    } else if (i == 0) {
                        aVar.mo69173b(0);
                        C49981p pVar = new C49981p(aVar.getActivity());
                        pVar.mo67838a(new C49979o());
                        pVar.mo85027a(aVar.f93984c, 0);
                        pVar.f115310d = aVar.mo69179h();
                        pVar.mo57616a(aVar.f93984c.getAid(), 1);
                        C39162r.onEvent(new MobClick().setEventName("public_permission").setLabelName("confirm").setValue(aVar.f93984c.getAid()));
                    }
                }
                if (privateStatus != 0 && aVar.f93984c != null && aVar.f93984c.playlist_info != null) {
                    aVar.f93984c.playlist_info = null;
                    return;
                }
                return;
            }
            aVar.mo69174c(R.string.dpc);
        }
    }
}
