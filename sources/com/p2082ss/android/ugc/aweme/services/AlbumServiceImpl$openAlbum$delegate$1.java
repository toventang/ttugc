package com.p2082ss.android.ugc.aweme.services;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.AbstractC22231l;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72084ao;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.AlbumServiceImpl$openAlbum$delegate$1 */
final class AlbumServiceImpl$openAlbum$delegate$1 implements AbstractC22231l {
    final /* synthetic */ C72084ao $scene;

    static {
        Covode.recordClassIndex(79576);
    }

    AlbumServiceImpl$openAlbum$delegate$1(C72084ao aoVar) {
        this.$scene = aoVar;
    }

    @Override // com.bytedance.scene.AbstractC22231l
    public final AbstractC22219j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
        C89219l.m154721d(classLoader, "");
        C89219l.m154721d(str, "");
        if (TextUtils.equals("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao", str)) {
            return this.$scene;
        }
        return null;
    }
}
