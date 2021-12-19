package com.p2082ss.android.ugc.aweme.story.draft;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.draft.model.C43222b;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.story.AbstractC76429a;
import com.p2082ss.android.ugc.aweme.story.base.p4020a.C76607a;
import com.p2082ss.android.ugc.aweme.tools.draft.C78133ai;
import com.p2082ss.android.ugc.aweme.tools.draft.p4101b.C78204d;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.draft.b */
public final class C76726b implements AbstractC76429a {

    /* renamed from: a */
    public static final C76726b f172228a = new C76726b();

    /* renamed from: b */
    private static final AbstractC89244h f172229b = C89250i.m154773a((AbstractC89171a) C76732f.f172238a);

    /* renamed from: c */
    private static final AbstractC89244h f172230c = C89250i.m154773a((AbstractC89171a) C76734h.f172241a);

    /* renamed from: d */
    private static final AbstractC89244h f172231d = C89250i.m154773a((AbstractC89171a) C76731e.f172237a);

    /* renamed from: a */
    public static boolean m134307a() {
        return ((Boolean) f172229b.getValue()).booleanValue();
    }

    /* renamed from: b */
    public static SQLiteDatabase m134309b() {
        return (SQLiteDatabase) f172230c.getValue();
    }

    /* renamed from: c */
    public static SQLiteDatabase m134310c() {
        return (SQLiteDatabase) f172231d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.AbstractC76429a
    /* renamed from: b */
    public final void mo120178b(SQLiteDatabase sQLiteDatabase) {
        C89219l.m154721d(sQLiteDatabase, "");
    }

    private C76726b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.draft.b$e */
    static final class C76731e extends AbstractC89220m implements AbstractC89171a<SQLiteDatabase> {

        /* renamed from: a */
        public static final C76731e f172237a = new C76731e();

        static {
            Covode.recordClassIndex(89727);
        }

        C76731e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SQLiteDatabase invoke() {
            C78204d a = C78204d.m136688a();
            C89219l.m154716b(a, "");
            return a.getReadableDatabase();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.draft.b$f */
    static final class C76732f extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C76732f f172238a = new C76732f();

        static {
            Covode.recordClassIndex(89728);
        }

        C76732f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C76607a.m134194a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.draft.b$h */
    static final class C76734h extends AbstractC89220m implements AbstractC89171a<SQLiteDatabase> {

        /* renamed from: a */
        public static final C76734h f172241a = new C76734h();

        static {
            Covode.recordClassIndex(89730);
        }

        C76734h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SQLiteDatabase invoke() {
            C78204d a = C78204d.m136688a();
            C89219l.m154716b(a, "");
            return a.getWritableDatabase();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.draft.b$a */
    public static final class C76727a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ String f172232a;

        static {
            Covode.recordClassIndex(89723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76727a(String str) {
            super(0);
            this.f172232a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            MethodCollector.m26663i(5989);
            C76726b.m134309b().beginTransaction();
            int delete = C76726b.m134309b().delete("local_story_draft", "_draft_session_id = ?", new String[]{this.f172232a});
            C76726b.m134309b().setTransactionSuccessful();
            C76726b.m134309b().endTransaction();
            Integer valueOf = Integer.valueOf(delete);
            MethodCollector.m26664o(5989);
            return valueOf;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.draft.b$b */
    static final class C76728b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ContentValues f172233a;

        static {
            Covode.recordClassIndex(89724);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76728b(ContentValues contentValues) {
            super(0);
            this.f172233a = contentValues;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            long replaceOrThrow = C76726b.m134309b().replaceOrThrow("local_story_draft", null, this.f172233a);
            StringBuilder sb = new StringBuilder("StoryDraftDBHelper:insertDraft with result:");
            boolean z2 = true;
            if (replaceOrThrow > 0) {
                z = true;
            } else {
                z = false;
            }
            C84911q.m145921a(sb.append(z).toString());
            if (replaceOrThrow <= 0) {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.draft.b$c */
    public static final class C76729c extends AbstractC89220m implements AbstractC89171a<C43223c> {

        /* renamed from: a */
        final /* synthetic */ String f172234a;

        static {
            Covode.recordClassIndex(89725);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76729c(String str) {
            super(0);
            this.f172234a = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C43223c invoke() {
            C43223c cVar;
            MethodCollector.m26663i(5019);
            Cursor rawQuery = C76726b.m134310c().rawQuery(this.f172234a, null);
            try {
                Cursor cursor = rawQuery;
                C89219l.m154716b(cursor, "");
                if (cursor.getCount() > 0) {
                    cursor.moveToNext();
                    cVar = C76726b.m134302a(cursor);
                } else {
                    cVar = null;
                }
                C89146c.m154636a(rawQuery, null);
                MethodCollector.m26664o(5019);
                return cVar;
            } catch (Throwable th) {
                C89146c.m154636a(rawQuery, th);
                MethodCollector.m26664o(5019);
                throw th;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.draft.b$g */
    public static final class C76733g extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ContentValues f172239a;

        /* renamed from: b */
        final /* synthetic */ String f172240b;

        static {
            Covode.recordClassIndex(89729);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76733g(ContentValues contentValues, String str) {
            super(0);
            this.f172239a = contentValues;
            this.f172240b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            MethodCollector.m26663i(5700);
            C76726b.m134309b().update("local_story_draft", this.f172239a, "_draft_session_id = ?", new String[]{this.f172240b});
            MethodCollector.m26664o(5700);
            return true;
        }
    }

    static {
        Covode.recordClassIndex(89722);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.draft.b$d */
    public static final class C76730d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f172235a;

        /* renamed from: b */
        final /* synthetic */ List f172236b;

        static {
            Covode.recordClassIndex(89726);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76730d(AbstractC89172b bVar, List list) {
            super(0);
            this.f172235a = bVar;
            this.f172236b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MethodCollector.m26663i(6144);
            Cursor rawQuery = C76726b.m134310c().rawQuery("select * from '" + ("local_story_draft' where user_id = '" + C63244g.m114602a().mo73255A().mo93904c() + "' or user_id is null order by save_time asc"), null);
            try {
                Cursor cursor = rawQuery;
                if (cursor != null) {
                    if (cursor.getCount() > 0) {
                        while (cursor.moveToNext()) {
                            C43223c a = C76726b.m134302a(cursor);
                            if (((Boolean) this.f172235a.invoke(a)).booleanValue()) {
                                this.f172236b.add(a);
                            }
                        }
                    }
                }
                C89146c.m154636a(rawQuery, null);
                C89391z zVar = C89391z.f203057a;
                MethodCollector.m26664o(6144);
                return zVar;
            } catch (Throwable th) {
                C89146c.m154636a(rawQuery, th);
                MethodCollector.m26664o(6144);
                throw th;
            }
        }
    }

    /* renamed from: c */
    private static void m134311c(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m26663i(6488);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `local_story_draft` (\n            `_draft_session_id`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n            `aweme`\tTEXT NOT NULL,\n            `music_path`\tTEXT,\n            `video_volume`\tINTEGER NOT NULL,\n            `music_volume`\tINTEGER NOT NULL,\n            `filter`\tINTEGER NOT NULL,\n            `music`\tTEXT,\n            `music_start`\tINTEGER NOT NULL,\n            `time`  LONG NOT NULL,\n            `save_time`  LONG NOT NULL,\n            `origin`    INTEGER,\n            `user_id`\tTEXT,\n            `segment_video`\tTEXT,\n            `sticker_id`\tTEXT,\n            `music_id`\tTEXT,\n            `effect_list`\tTEXT,\n            `camera_poi`\tINTEGER,\n            `filter_label`\tTEXT,\n            `is_private`\tINTEGER,\n            `max_duration`\tINTEGER,\n            `custom_cover_start`\tFLOAT,\n            `draft_extras`\tTEXT,\n            `last_output_path`\tTEXT\n        );");
        MethodCollector.m26664o(6488);
    }

    /* renamed from: a */
    public static C43223c m134303a(String str) {
        C89219l.m154721d(str, "");
        if (!m134307a()) {
            return null;
        }
        return (C43223c) m134304a((Object) null, new C76729c("select * from local_story_draft where _draft_session_id = '" + str + '\''));
    }

    /* renamed from: a */
    public static List<C43223c> m134305a(AbstractC89172b<? super C43223c, Boolean> bVar) {
        C89219l.m154721d(bVar, "");
        if (!m134307a()) {
            return C89086z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        m134304a(C89391z.f203057a, new C76730d(bVar, arrayList));
        C84911q.m145921a("StoryDraftDBHelper:queryDraftList success, result size:" + arrayList.size());
        return arrayList;
    }

    /* renamed from: a */
    public static C43223c m134302a(Cursor cursor) {
        float f;
        C43223c cVar = new C43223c();
        cVar.f100905e = C76719a.m134293c(cursor, "_draft_session_id");
        cVar.f100902b = C78133ai.m136601b(C76719a.m134293c(cursor, "aweme"));
        cVar.f100908h = C76719a.m134293c(cursor, "music_path");
        cVar.f100910j = C76719a.m134291a(cursor, "video_volume");
        cVar.f100911k = C76719a.m134291a(cursor, "music_volume");
        m134306a(cVar, C76719a.m134291a(cursor, "filter"));
        cVar.f100906f = C78133ai.m136603c(C76719a.m134293c(cursor, "music"));
        cVar.f100914n = C76719a.m134291a(cursor, "music_start");
        cVar.f100886I = C76719a.m134292b(cursor, "time");
        cVar.f100887J = C76719a.m134292b(cursor, "save_time");
        cVar.f100916p = C76719a.m134291a(cursor, "origin");
        cVar.f100885H = C76719a.m134293c(cursor, "user_id");
        cVar.f100888K = C76719a.m134293c(cursor, "segment_video");
        cVar.f100892O = C76719a.m134293c(cursor, "sticker_id");
        cVar.f100882E = C78133ai.m136604d(C76719a.m134293c(cursor, "effect_list"));
        cVar.f100922v = C76719a.m134291a(cursor, "camera_poi");
        cVar.f100921u = C76719a.m134293c(cursor, "filter_label");
        cVar.f100881D = C76719a.m134291a(cursor, "is_private");
        cVar.f100883F = (long) C76719a.m134291a(cursor, "max_duration");
        C89219l.m154721d(cursor, "");
        C89219l.m154721d("custom_cover_start", "");
        int columnIndex = cursor.getColumnIndex("custom_cover_start");
        if (columnIndex >= 0) {
            f = cursor.getFloat(columnIndex);
        } else {
            f = 0.0f;
        }
        cVar.f100896S = f;
        try {
            cVar.mo73624a((C43222b) C63244g.m114602a().mo73261G().mo46670a(C76719a.m134293c(cursor, "draft_extras"), C43222b.class));
            cVar.f100900W.f100826bF = C76719a.m134293c(cursor, "last_output_path");
        } catch (Exception e) {
            e.printStackTrace();
        }
        C63244g.m114602a().mo73275c();
        cVar.f100895R = 3;
        return cVar;
    }

    /* renamed from: a */
    public static boolean m134308a(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        String a = C43225d.m86324a(cVar);
        C89219l.m154721d(a, "");
        if (m134307a() && a.length() != 0) {
            int intValue = ((Number) m134304a((Object) -1, (AbstractC89171a) new C76727a(a))).intValue();
            C84911q.m145921a("StoryDraftDBHelper:deleteDraft with result:" + intValue + ",key:" + a);
            if (intValue != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.AbstractC76429a
    /* renamed from: a */
    public final void mo120176a(SQLiteDatabase sQLiteDatabase) {
        C89219l.m154721d(sQLiteDatabase, "");
        m134311c(sQLiteDatabase);
    }

    /* renamed from: a */
    public static <T> T m134304a(T t, AbstractC89171a<? extends T> aVar) {
        try {
            t = (T) aVar.invoke();
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            return t;
        }
    }

    /* renamed from: a */
    public static void m134306a(C43223c cVar, int i) {
        C89219l.m154721d(cVar, "");
        cVar.f100913m = i;
        cVar.mo73731s(C63238c.f143565C.mo73272a("story-filter").mo86005c().mo86019a(i).getFilterFolder());
    }

    @Override // com.p2082ss.android.ugc.aweme.story.AbstractC76429a
    /* renamed from: a */
    public final void mo120177a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C89219l.m154721d(sQLiteDatabase, "");
        if (i <= 22 && i != i2) {
            m134311c(sQLiteDatabase);
        }
    }
}
