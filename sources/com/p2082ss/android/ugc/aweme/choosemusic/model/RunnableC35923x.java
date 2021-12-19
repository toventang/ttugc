package com.p2082ss.android.ugc.aweme.choosemusic.model;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60824b;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60826d;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p077b.C1743j;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.x */
public final /* synthetic */ class RunnableC35923x implements Runnable {

    /* renamed from: a */
    private final C35920u f84784a;

    /* renamed from: b */
    private final WeakReference f84785b;

    /* renamed from: c */
    private final List f84786c;

    /* renamed from: d */
    private final C1743j f84787d;

    static {
        Covode.recordClassIndex(43163);
    }

    RunnableC35923x(C35920u uVar, WeakReference weakReference, List list, C1743j jVar) {
        this.f84784a = uVar;
        this.f84785b = weakReference;
        this.f84786c = list;
        this.f84787d = jVar;
    }

    public final void run() {
        int i;
        MethodCollector.m26663i(1104);
        C35920u uVar = this.f84784a;
        WeakReference weakReference = this.f84785b;
        List<? extends MusicModel> list = this.f84786c;
        C1743j jVar = this.f84787d;
        Context context = (Context) weakReference.get();
        jVar.getClass();
        C35883ac acVar = new C35883ac(jVar);
        if (context == null) {
            acVar.finish(new ArrayList());
            MethodCollector.m26664o(1104);
            return;
        }
        list.clear();
        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        ArrayList arrayList = new ArrayList();
        if (uVar.f84779e == null) {
            uVar.f84779e = context.getContentResolver().query(uri, new String[]{"_id", "is_music", "title", "artist", "album", "album_id", "_display_name", "_size", "duration"}, null, null, "title_key");
        }
        if (uVar.f84779e == null) {
            acVar.finish(list);
            MethodCollector.m26664o(1104);
            return;
        }
        int i2 = uVar.f84778d * 20;
        int i3 = ((uVar.f84778d + 1) * 20) - 1;
        if (i3 > uVar.f84779e.getCount() - 1) {
            i3 = uVar.f84779e.getCount() - 1;
            uVar.f84776b = true;
        }
        if (i2 <= uVar.f84779e.getCount() - 1) {
            uVar.f84779e.moveToPosition(i2 - 1);
            while (true) {
                if (!uVar.f84779e.moveToNext()) {
                    i = 1;
                    break;
                }
                int i4 = uVar.f84779e.getInt(uVar.f84779e.getColumnIndex("is_music"));
                if (C60826d.m110427a() || i4 != 0) {
                    Uri withAppendedId = ContentUris.withAppendedId(uri, uVar.f84779e.getLong(uVar.f84779e.getColumnIndex("_id")));
                    String string = uVar.f84779e.getString(uVar.f84779e.getColumnIndex("title"));
                    String string2 = uVar.f84779e.getString(uVar.f84779e.getColumnIndex("artist"));
                    String string3 = uVar.f84779e.getString(uVar.f84779e.getColumnIndex("album"));
                    uVar.f84779e.getLong(uVar.f84779e.getColumnIndex("album_id"));
                    long j = uVar.f84779e.getLong(uVar.f84779e.getColumnIndex("duration"));
                    String string4 = uVar.f84779e.getString(uVar.f84779e.getColumnIndex("_display_name"));
                    long j2 = uVar.f84779e.getLong(uVar.f84779e.getColumnIndex("_size"));
                    MusicModel musicModel = new MusicModel();
                    musicModel.setLocalMusicId(C60824b.m110421a(string4, string2, string3, j2));
                    musicModel.setName(string);
                    musicModel.setMusicStatus(1);
                    musicModel.setAlbum(string3);
                    if (TextUtils.equals("<unknown>", string2)) {
                        string2 = "unknown";
                    }
                    musicModel.setSinger(string2);
                    musicModel.setLocalPath(withAppendedId.toString());
                    musicModel.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
                    musicModel.setMusicType(MusicModel.MusicType.LOCAL);
                    musicModel.setLocalMusicDuration(j);
                    i = 1;
                    musicModel.setDataType(1);
                    list.add(musicModel);
                    arrayList.add(Long.valueOf(j));
                    if (uVar.f84779e.getPosition() == i3) {
                        break;
                    }
                }
            }
            uVar.f84778d += i;
            if (uVar.f84776b) {
                uVar.f84779e.close();
                uVar.f84779e = null;
            }
            C51423a.m95792b("Local Sound scan result", C35920u.m73284a((List<MusicModel>) list));
            AVExternalServiceImpl.m113114a().abilityService().infoService().audioLegal(context, list, new C35881aa(arrayList), new C35882ab(acVar, list));
            MethodCollector.m26664o(1104);
            return;
        }
        uVar.f84779e.close();
        acVar.finish(list);
        MethodCollector.m26664o(1104);
    }
}
