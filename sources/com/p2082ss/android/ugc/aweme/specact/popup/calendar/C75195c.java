package com.p2082ss.android.ugc.aweme.specact.popup.calendar;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xbridge.system.p1357b.p1358a.p1360b.C18873b;
import com.bytedance.keva.Keva;
import com.kakao.usermgmt.StringSet;
import java.util.TimeZone;
import p4600h.p4601a.C89064i;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.calendar.c */
public final class C75195c {

    /* renamed from: a */
    static final Keva f169079a = Keva.getRepo("com.ss.android.ugc.aweme.specact.calendar.CalendarWriter");

    /* renamed from: b */
    public static final C75195c f169080b = new C75195c();

    private C75195c() {
    }

    static {
        Covode.recordClassIndex(88073);
    }

    /* renamed from: a */
    private static Uri m131930a() {
        Uri build = CalendarContract.Events.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", "com.tiktok").appendQueryParameter("account_type", "LOCAL").build();
        C89219l.m154716b(build, "");
        return build;
    }

    /* renamed from: a */
    private static void m131931a(String str) {
        f169079a.storeBoolean(str, true);
    }

    /* renamed from: b */
    private static int m131934b(Context context) {
        MethodCollector.m26663i(6759);
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.android.calendar/calendars"), null, null, null, null);
        int i = -1;
        if (query != null) {
            if (query.getCount() > 0) {
                query.moveToFirst();
                while (true) {
                    if (query.getInt(query.getColumnIndex("calendar_access_level")) <= 200) {
                        if (!query.moveToNext()) {
                            break;
                        }
                    } else {
                        i = query.getInt(query.getColumnIndex("_id"));
                        break;
                    }
                }
            }
            query.close();
        }
        MethodCollector.m26664o(6759);
        return i;
    }

    /* renamed from: a */
    private static int m131928a(Context context) {
        int b = m131934b(context);
        if (b >= 0) {
            return b;
        }
        TimeZone timeZone = TimeZone.getDefault();
        C89219l.m154716b(timeZone, "");
        ContentValues contentValues = new ContentValues();
        contentValues.put(StringSet.name, "tiktok");
        contentValues.put("account_name", "tiktok@tiktok.com");
        contentValues.put("account_type", "com.tiktok");
        contentValues.put("calendar_displayName", "TikTok");
        contentValues.put("visible", (Integer) 1);
        contentValues.put("calendar_color", (Integer) -16776961);
        contentValues.put("calendar_access_level", (Integer) 700);
        contentValues.put("sync_events", (Integer) 1);
        contentValues.put("calendar_timezone", timeZone.getID());
        contentValues.put("ownerAccount", "tiktok@tiktok.com");
        contentValues.put("canOrganizerRespond", (Integer) 0);
        Uri parse = Uri.parse("content://com.android.calendar/calendars");
        C89219l.m154716b(parse, "");
        Uri build = parse.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", "tiktok@tiktok.com").appendQueryParameter("account_type", "com.tiktok").build();
        C89219l.m154716b(build, "");
        Uri insert = context.getContentResolver().insert(build, contentValues);
        if (insert == null || ContentUris.parseId(insert) < 0) {
            return -1;
        }
        return m131934b(context);
    }

    /* renamed from: a */
    private static boolean m131933a(C75194b bVar) {
        if (bVar.f169068a.length() == 0) {
            return false;
        }
        if ((bVar.f169069b.length() <= 0 || ((!(!C89219l.m154714a((Object) bVar.f169069b, (Object) "daily")) || !(!C89219l.m154714a((Object) bVar.f169069b, (Object) "weekly")) || !(!C89219l.m154714a((Object) bVar.f169069b, (Object) "monthly")) || !(!C89219l.m154714a((Object) bVar.f169069b, (Object) "yearly"))) && bVar.f169070c >= 0 && bVar.f169071d >= 0)) && bVar.f169072e >= 0 && bVar.f169073f >= 0 && bVar.f169074g >= 0 && bVar.f169076i.length() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m131932a(Context context, String str) {
        MethodCollector.m26663i(6906);
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        boolean z = true;
        Cursor query = context.getContentResolver().query(CalendarContract.Events.CONTENT_URI, new String[]{C18873b.f44703b}, C89064i.m154484a(new String[]{"sync_data1=?"}, " and ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62), new String[]{str}, null);
        if (query != null) {
            try {
                Cursor cursor = query;
                C89219l.m154716b(cursor, "");
                if (cursor.getCount() <= 0) {
                    z = false;
                }
                C89146c.m154636a(query, null);
                MethodCollector.m26664o(6906);
                return z;
            } catch (Throwable th) {
                C89146c.m154636a(query, th);
                MethodCollector.m26664o(6906);
                throw th;
            }
        } else {
            MethodCollector.m26664o(6906);
            return false;
        }
    }

    /* renamed from: a */
    public static int m131929a(Context context, C75194b bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
        if (!m131933a(bVar)) {
            return -1;
        }
        if (m131932a(context, bVar.f169068a)) {
            return 5;
        }
        int a = m131928a(context);
        if (a < 0) {
            return 1000;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("calendar_id", Integer.valueOf(a));
        contentValues.put("title", bVar.f169076i);
        if (!TextUtils.isEmpty(bVar.f169077j)) {
            contentValues.put("description", bVar.f169077j);
        }
        contentValues.put("dtstart", Long.valueOf(bVar.f169072e));
        contentValues.put("dtend", Long.valueOf(bVar.f169073f));
        TimeZone timeZone = TimeZone.getDefault();
        C89219l.m154716b(timeZone, "");
        contentValues.put("eventTimezone", timeZone.getID());
        contentValues.put("allDay", Boolean.valueOf(bVar.f169075h));
        contentValues.put(C18873b.f44703b, bVar.f169068a);
        if (bVar.f169074g >= 0) {
            contentValues.put("hasAlarm", (Integer) 1);
        }
        if (!TextUtils.isEmpty(bVar.f169069b)) {
            contentValues.put("rrule", "FREQ=" + bVar.f169069b + ";INTERVAL=" + bVar.f169070c + ";COUNT=" + bVar.f169071d);
        }
        Uri insert = context.getContentResolver().insert(m131930a(), contentValues);
        if (bVar.f169074g >= 0) {
            ContentValues contentValues2 = new ContentValues();
            if (insert != null) {
                contentValues2.put("event_id", Long.valueOf(ContentUris.parseId(insert)));
            }
            contentValues2.put("minutes", Long.valueOf(bVar.f169074g / 60000));
            contentValues2.put("method", (Integer) 1);
            context.getContentResolver().insert(Uri.parse("content://com.android.calendar/reminders"), contentValues2);
        }
        m131931a(bVar.f169068a);
        return 1;
    }
}
