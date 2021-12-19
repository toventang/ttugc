package com.p2082ss.android.ugc.trill.share.api;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.share.AbstractC69357n;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.trill.share.api.a */
public final class C85157a extends C39088c<AbstractC39085b<AutoShare>, AbstractC69357n> {
    static {
        Covode.recordClassIndex(99200);
    }

    public C85157a() {
        mo67838a(new AbstractC39085b<AutoShare>() {
            /* class com.p2082ss.android.ugc.trill.share.api.C85157a.C851581 */

            static {
                Covode.recordClassIndex(99201);
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 10) {
                    return false;
                }
                return true;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean sendRequest(final Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
                    /* class com.p2082ss.android.ugc.trill.share.api.C85157a.C851581.CallableC851591 */

                    static {
                        Covode.recordClassIndex(99202);
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Object[] objArr = objArr;
                        Object obj = objArr[0];
                        Object obj2 = objArr[1];
                        Object obj3 = objArr[2];
                        String str = (String) objArr[3];
                        String str2 = (String) objArr[4];
                        String str3 = (String) objArr[5];
                        String str4 = (String) objArr[6];
                        String str5 = (String) objArr[7];
                        String str6 = (String) objArr[8];
                        String str7 = (String) objArr[9];
                        HashMap hashMap = new HashMap();
                        hashMap.put("platform_type", obj);
                        hashMap.put("share_url", obj2);
                        hashMap.put("share_message", obj3);
                        if (!TextUtils.isEmpty(str)) {
                            hashMap.put("fb_access_token", str);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            hashMap.put("twitter_access_token", str2);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            hashMap.put("access_token_secret", str3);
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            hashMap.put("youtube_code", str4);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            hashMap.put("item_id", str5);
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            hashMap.put("youtube_title", str6);
                        }
                        if (!TextUtils.isEmpty(str7)) {
                            hashMap.put("youtube_desc", str7);
                        }
                        return ShareApi.f190515a.autoShare(hashMap).execute().f52262b;
                    }
                }, 0);
                return true;
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        if (this.f92286h != null && this.f92286h.mData != null && this.f92287i != null) {
            ((AbstractC69357n) this.f92287i).mo109447a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        if (this.f92287i != null) {
            ((AbstractC69357n) this.f92287i).mo109448b();
        }
    }
}
