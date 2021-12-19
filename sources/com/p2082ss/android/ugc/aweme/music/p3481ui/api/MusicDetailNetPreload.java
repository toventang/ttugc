package com.p2082ss.android.ugc.aweme.music.p3481ui.api;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.p1243b.AbstractC17788c;
import com.bytedance.ies.powerpreload.p1243b.C17794i;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.music.api.MusicDetailApi;
import com.p2082ss.android.ugc.aweme.music.model.MusicDetail;
import java.util.concurrent.Future;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.api.MusicDetailNetPreload */
public final class MusicDetailNetPreload implements AbstractC17788c<MusicDetailApi.DetailApi, Future<MusicDetail>> {
    static {
        Covode.recordClassIndex(71727);
    }

    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17788c
    public final C17794i getPreloadStrategy(Bundle bundle) {
        return new C17794i(0, Api.f79771d, false, 5);
    }

    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17788c
    public final boolean handleException(Exception exc) {
        C89219l.m154721d(exc, "");
        exc.printStackTrace();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r3 == null) goto L_0x0021;
     */
    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17789d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean enable(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r1 = ""
            if (r8 == 0) goto L_0x000c
            java.lang.String r0 = "id"
            java.lang.String r6 = r8.getString(r0)
            if (r6 != 0) goto L_0x000d
        L_0x000c:
            r6 = r1
        L_0x000d:
            p4600h.p4611f.p4613b.C89219l.m154716b(r6, r1)
            r5 = 0
            if (r8 == 0) goto L_0x0045
            java.lang.String r0 = "click_reason"
            int r4 = r8.getInt(r0)
            java.lang.String r0 = "partnerMusicId"
            java.lang.String r3 = r8.getString(r0)
            if (r3 != 0) goto L_0x0022
        L_0x0021:
            r3 = r1
        L_0x0022:
            p4600h.p4611f.p4613b.C89219l.m154716b(r3, r1)
            if (r8 == 0) goto L_0x002f
            java.lang.String r0 = "partnerName"
            java.lang.String r2 = r8.getString(r0)
            if (r2 != 0) goto L_0x0030
        L_0x002f:
            r2 = r1
        L_0x0030:
            p4600h.p4611f.p4613b.C89219l.m154716b(r2, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 1
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = java.lang.String.valueOf(r4)
            com.ss.android.ugc.aweme.music.model.MusicDetail r0 = com.p2082ss.android.ugc.aweme.music.p3474i.C60808d.m110396a(r6, r0)
            if (r0 != 0) goto L_0x0047
            return r1
        L_0x0045:
            r4 = 0
            goto L_0x0021
        L_0x0047:
            return r5
        L_0x0048:
            com.ss.android.ugc.aweme.music.model.MusicDetail r0 = com.p2082ss.android.ugc.aweme.music.p3474i.C60808d.m110396a(r3, r2)
            if (r0 != 0) goto L_0x004f
            return r1
        L_0x004f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.p3481ui.api.MusicDetailNetPreload.enable(android.os.Bundle):boolean");
    }

    /* Return type fixed from 'com.google.c.h.a.q<com.ss.android.ugc.aweme.music.model.MusicDetail>' to match base method */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r2 == null) goto L_0x0023;
     */
    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17788c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.Future<com.p2082ss.android.ugc.aweme.music.model.MusicDetail> preload(android.os.Bundle r7, p4600h.p4611f.p4612a.AbstractC89172b<? super java.lang.Class<com.p2082ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi>, ? extends com.p2082ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi> r8) {
        /*
            r6 = this;
            java.lang.String r4 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r8, r4)
            if (r7 == 0) goto L_0x000f
            java.lang.String r0 = "id"
            java.lang.String r5 = r7.getString(r0)
            if (r5 != 0) goto L_0x0010
        L_0x000f:
            r5 = r4
        L_0x0010:
            p4600h.p4611f.p4613b.C89219l.m154716b(r5, r4)
            if (r7 == 0) goto L_0x004b
            java.lang.String r0 = "click_reason"
            int r3 = r7.getInt(r0)
            java.lang.String r0 = "partnerMusicId"
            java.lang.String r2 = r7.getString(r0)
            if (r2 != 0) goto L_0x0024
        L_0x0023:
            r2 = r4
        L_0x0024:
            p4600h.p4611f.p4613b.C89219l.m154716b(r2, r4)
            if (r7 == 0) goto L_0x0031
            java.lang.String r0 = "partnerName"
            java.lang.String r1 = r7.getString(r0)
            if (r1 != 0) goto L_0x0032
        L_0x0031:
            r1 = r4
        L_0x0032:
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x004d
            java.lang.Class<com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi> r0 = com.p2082ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi.class
            java.lang.Object r0 = r8.invoke(r0)
            com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi r0 = (com.p2082ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi) r0
            com.google.c.h.a.q r0 = r0.queryMusic(r5, r3)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r4)
            return r0
        L_0x004b:
            r3 = 0
            goto L_0x0023
        L_0x004d:
            java.lang.Class<com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi> r0 = com.p2082ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi.class
            java.lang.Object r0 = r8.invoke(r0)
            com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi r0 = (com.p2082ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi) r0
            com.google.c.h.a.q r0 = r0.queryPartnerMusic(r2, r1)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.p3481ui.api.MusicDetailNetPreload.preload(android.os.Bundle, h.f.a.b):com.google.c.h.a.q");
    }
}
