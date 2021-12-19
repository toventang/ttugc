package com.p2082ss.android.socialbase.downloader.p2180c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;
import java.io.File;

/* renamed from: com.ss.android.socialbase.downloader.c.a */
public class C30297a extends SQLiteOpenHelper {

    /* renamed from: a */
    private static volatile C30297a f72274a;

    /* renamed from: b */
    private boolean f72275b = false;

    static {
        Covode.recordClassIndex(36809);
    }

    private C30297a() {
        super(C30399c.m61674B(), "downloader.db", (SQLiteDatabase.CursorFactory) null, 15);
    }

    /* renamed from: a */
    public static C30297a m61290a() {
        MethodCollector.m26663i(11474);
        if (f72274a == null) {
            synchronized (C30297a.class) {
                try {
                    if (f72274a == null) {
                        f72274a = new C30297a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11474);
                    throw th;
                }
            }
        }
        C30297a aVar = f72274a;
        MethodCollector.m26664o(11474);
        return aVar;
    }

    public SQLiteDatabase getReadableDatabase() {
        MethodCollector.m26663i(11649);
        Context B = C30399c.m61674B();
        if (this.f72275b || B == null) {
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            MethodCollector.m26664o(11649);
            return readableDatabase;
        }
        try {
            File file = new File("/data/data/" + B.getPackageName() + "/database/main/");
            if (!file.exists()) {
                file.mkdir();
            }
            super.getReadableDatabase().execSQL("PRAGMA temp_store_directory = tempDir");
            this.f72275b = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        SQLiteDatabase readableDatabase2 = super.getReadableDatabase();
        MethodCollector.m26664o(11649);
        return readableDatabase2;
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        if (C30472a.f72639a.mo54258a("disable_sqlite_wal", 0) > 0 && Build.VERSION.SDK_INT == 28) {
            sQLiteDatabase.disableWriteAheadLogging();
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m26663i(11650);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS downloader( _id INTEGER PRIMARY KEY, url TEXT, savePath TEXT, tempPath TEXT, name TEXT, chunkCount INTEGER, status INTEGER, curBytes INTEGER, totalBytes INTEGER, eTag TEXT, onlyWifi INTEGER, force INTEGER, retryCount INTEGER, extra TEXT, mimeType TEXT, title TEXT, notificationEnable INTEGER, notificationVisibility INTEGER, isFirstDownload INTEGER, isFirstSuccess INTEGER, needHttpsToHttpRetry INTEGER, downloadTime INTEGER, packageName TEXT, md5 TEXT, retryDelay INTEGER, curRetryTime INTEGER, retryDelayStatus INTEGER, defaultHttpServiceBackUp INTEGER, chunkRunnableReuse INTEGER, retryDelayTimeArray TEXT, chunkDowngradeRetry INTEGER, backUpUrlsStr TEXT, backUpUrlRetryCount INTEGER, realDownloadTime INTEGER, retryScheduleMinutes INTEGER, independentProcess INTEGER, auxiliaryJsonobjectString TEXT, iconUrl TEXT, appVersionCode INTEGER, taskId TEXT)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS downloadChunk( _id INTEGER, chunkIndex INTEGER, startOffset INTEGER, curOffset INTEGER, endOffset INTEGER, chunkContentLen INTEGER, hostChunkIndex INTEGER )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS segments( _id INTEGER PRIMARY KEY,info TEXT )");
        MethodCollector.m26664o(11650);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (C30434a.m62025a()) {
            C30434a.m62027b("DownloaderLogger", "onDowngrade");
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        MethodCollector.m26663i(11813);
        switch (i) {
            case 1:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD mimeType TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD title TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD notificationEnable INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD notificationVisibility INTEGER");
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD isFirstDownload INTEGER");
            case 3:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD isFirstSuccess INTEGER");
            case 4:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD needHttpsToHttpRetry INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD downloadTime INTEGER");
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD packageName TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD md5 TEXT");
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelay INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD curRetryTime INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelayStatus INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD defaultHttpServiceBackUp INTEGER");
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                sQLiteDatabase.execSQL("ALTER TABLE downloadChunk ADD chunkContentLen INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloadChunk ADD hostChunkIndex INTEGER");
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD chunkRunnableReuse INTEGER");
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelayTimeArray TEXT");
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD chunkDowngradeRetry INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD backUpUrlsStr TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD backUpUrlRetryCount INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD realDownloadTime INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryScheduleMinutes INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD independentProcess INTEGER");
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD auxiliaryJsonobjectString TEXT");
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD iconUrl TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD appVersionCode INTEGER");
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS segments( _id INTEGER PRIMARY KEY,info TEXT )");
            case ABRConfig.ABR_SELECT_SCENE:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD taskId TEXT");
                break;
        }
        MethodCollector.m26664o(11813);
    }
}
