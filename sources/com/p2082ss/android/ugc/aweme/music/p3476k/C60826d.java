package com.p2082ss.android.ugc.aweme.music.p3476k;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.music.C60752e;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.music.k.d */
public class C60826d {

    /* renamed from: a */
    public static String f138234a;

    /* renamed from: b */
    public static final boolean f138235b = false;

    /* renamed from: c */
    private static final String f138236c = C60826d.class.getSimpleName();

    /* renamed from: d */
    private static final Uri f138237d = Uri.parse("content://media/external/audio/albumart");

    static {
        Covode.recordClassIndex(71383);
    }

    /* renamed from: a */
    public static boolean m110427a() {
        String b = m110429b("ro.build.display.id");
        if (TextUtils.isEmpty(b) || !b.toLowerCase().contains("flyme")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m110424a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new URI(str).getHost();
        } catch (Exception e) {
            e.printStackTrace();
            C51423a.m95787a("music url illegal");
            return null;
        }
    }

    /* renamed from: b */
    private static String m110429b(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m110423a(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return C1764a.m5929a(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
        }
        return C1764a.m5929a(Locale.getDefault(), "%02d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)});
    }

    /* renamed from: a */
    public static void m110425a(Activity activity, int i) {
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//assmusic/category");
        if (i == 0) {
            buildRoute.withParam("music_type", 6);
        } else if (i == 2) {
            buildRoute.withParam("music_type", 5);
        }
        buildRoute.withParam("sound_page_scene", 0);
        activity.startActivityForResult(buildRoute.buildIntent(), 10086);
    }

    /* renamed from: a */
    public static void m110426a(Context context, List<MusicModel> list, IAVInfoService.IGetInfoCallback<List<MusicModel>> iGetInfoCallback) {
        MethodCollector.m26663i(3918);
        if (context == null) {
            iGetInfoCallback.finish(new ArrayList());
        }
        list.clear();
        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        ArrayList arrayList = new ArrayList();
        Cursor query = context.getContentResolver().query(uri, new String[]{"_id", "is_music", "title", "artist", "album", "album_id", "_display_name", "_size", "duration"}, null, null, "title_key");
        if (query == null) {
            iGetInfoCallback.finish(list);
        }
        while (query.moveToNext()) {
            int i = query.getInt(query.getColumnIndex("is_music"));
            if (m110427a() || i != 0) {
                Uri withAppendedId = ContentUris.withAppendedId(uri, query.getLong(query.getColumnIndex("_id")));
                String string = query.getString(query.getColumnIndex("title"));
                String string2 = query.getString(query.getColumnIndex("artist"));
                String string3 = query.getString(query.getColumnIndex("album"));
                query.getLong(query.getColumnIndex("album_id"));
                long j = query.getLong(query.getColumnIndex("duration"));
                String string4 = query.getString(query.getColumnIndex("_display_name"));
                long j2 = query.getLong(query.getColumnIndex("_size"));
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
                musicModel.setDataType(1);
                list.add(musicModel);
                arrayList.add(Long.valueOf(j));
            }
        }
        query.close();
        AVExternalServiceImpl.m113114a().abilityService().infoService().audioLegal(context, list, new C60827e(arrayList), new C60828f(iGetInfoCallback, list));
        MethodCollector.m26664o(3918);
    }

    /* renamed from: a */
    public static boolean m110428a(MusicModel musicModel, Context context, boolean z) {
        if (musicModel == null) {
            return false;
        }
        if (f138235b) {
            musicModel.getMusicStatus();
            musicModel.getLocalPath();
        }
        if (!TextUtils.isEmpty(musicModel.getLocalPath())) {
            return true;
        }
        if (musicModel.getUrl() != null && !TextUtils.isEmpty(musicModel.getUrl().getUri()) && !C13603b.m24435a((Collection) musicModel.getUrl().getUrlList()) && musicModel.getMusicStatus() != 0) {
            return true;
        }
        String offlineDesc = musicModel.getOfflineDesc();
        if (TextUtils.isEmpty(offlineDesc)) {
            offlineDesc = C60752e.m110286a(musicModel, context);
        }
        if (z) {
            new C79459a(context).mo123052a(offlineDesc).mo123053a();
        }
        return false;
    }
}
