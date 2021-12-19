package com.p2082ss.android.ugc.aweme.tools.draft.p4101b;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.b.d */
public class C78204d extends SQLiteOpenHelper {

    /* renamed from: a */
    private static C78204d f175656a;

    static {
        Covode.recordClassIndex(91319);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C78204d() {
        /*
            r8 = this;
            android.app.Application r0 = com.p2082ss.android.ugc.aweme.port.p3561in.C63247i.f143610a
            android.content.Context r3 = m136687a(r0)
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.m29616a()
            java.lang.String r1 = "use_draft_database_error_handler"
            r0 = 1
            boolean r0 = r2.mo25400a(r1, r0)
            if (r0 == 0) goto L_0x0022
            com.ss.android.ugc.aweme.tools.draft.b.a r7 = new com.ss.android.ugc.aweme.tools.draft.b.a
            r7.<init>()
        L_0x0018:
            java.lang.String r4 = "aweme.db"
            r5 = 0
            r6 = 23
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
        L_0x0022:
            r7 = 0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.p4101b.C78204d.<init>():void");
    }

    /* renamed from: a */
    public static C78204d m136688a() {
        MethodCollector.m26663i(9777);
        if (f175656a == null) {
            synchronized (C78204d.class) {
                try {
                    if (f175656a == null) {
                        f175656a = new C78204d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9777);
                    throw th;
                }
            }
        }
        C78204d dVar = f175656a;
        MethodCollector.m26664o(9777);
        return dVar;
    }

    /* renamed from: a */
    private static Context m136687a(Application application) {
        Context applicationContext = application.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m26663i(10081);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `local_draft` (\n\t`video_path`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`aweme`\tTEXT NOT NULL,\n\t`music_path`\tTEXT,\n\t`voice_path`\tTEXT ,\n\t`video_volume`\tINTEGER NOT NULL,\n\t`music_volume`\tINTEGER NOT NULL,\n\t`filter`\tINTEGER NOT NULL,\n\t`music`\tTEXT,\n\t`music_start`\tINTEGER NOT NULL,\n\t`time`\tLONG NOT NULL,\n\t`effect`\tINTEGER,\n\t`origin`\tINTEGER,\n\t`face_beauty`\tINTEGER,\n\t`user_id`\tTEXT,\n\t`segment_video`\tTEXT,\n\t`segment_sdk`\tTEXT,\n\t`hard_encode`\tINTEGER,\n\t`special_points`\tINTEGER,\n\t`sticker_id`\tTEXT,\n\t`music_id`\tTEXT,\n\t`sticker_path`\tTEXT,\n\t`effect_list`\tTEXT,\n\t`camera_poi`\tINTEGER,\n\t`filter_label`\tTEXT,\n\t`beauty_label`\tINTEGER,\n\t`reverse_path`\tTEXT,\n\t`music_effect`\tTEXT,\n\t`video_speed`\tTEXT,\n\t`music_effect_segments`\tTEXT,\n\t`is_private`\tINTEGER,\n\t`max_duration`\tINTEGER,\n\t`audio_track`\tTEXT,\n\t`new_version`\tINTEGER,\n\t`output_wav_path`\tTEXT,\n\t`custom_cover_start`\tFLOAT,\n\t`video_width`\tINTEGER\tDEFAULT 540,\n\t`video_height`\tINTEGER\tDEFAULT 960,\n\t`duet_from`\tTEXT,\n\t`sync_platforms`\tTEXT,\n\t`photo_movie`\tTEXT,\n\t`draft_extras`\tTEXT,\n\t`draft_view_info`\tTEXT,\n\t`save_time`\tLONG\n);");
        C63244g.m114602a().mo73286n().mo120442c().mo120176a(sQLiteDatabase);
        C63244g.m114602a().mo73275c().mo101843a().mo101857a(sQLiteDatabase);
        MethodCollector.m26664o(10081);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            super.onDowngrade(sQLiteDatabase, i, i2);
            C63244g.m114602a().mo73286n().mo120442c().mo120178b(sQLiteDatabase);
            C63244g.m114602a().mo73275c().mo101843a().mo101858a(sQLiteDatabase, i, i2);
        } catch (Exception e) {
            C63244g.m114602a().mo73263I().mo101637a((Throwable) e);
            C13628n.m24506a(m136687a(C63247i.f143610a), (int) R.string.h30);
            System.exit(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0204, code lost:
        if (r33 <= 2) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r32, int r33, int r34) {
        /*
        // Method dump skipped, instructions count: 520
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.p4101b.C78204d.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
