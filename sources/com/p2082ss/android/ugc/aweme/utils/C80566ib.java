package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.utils.ib */
public final class C80566ib {

    /* renamed from: a */
    private static Locale f180176a = SettingServiceImpl.m120782v().mo108881q();

    /* renamed from: b */
    private static final SimpleDateFormat f180177b = new SimpleDateFormat("yyyy-MM-dd", f180176a);

    /* renamed from: c */
    private static final SimpleDateFormat f180178c = new SimpleDateFormat("MM-dd", f180176a);

    /* renamed from: d */
    private static final SimpleDateFormat f180179d = new SimpleDateFormat("M/d/yyyy", f180176a);

    /* renamed from: e */
    private static final SimpleDateFormat f180180e = new SimpleDateFormat("M/d", f180176a);

    /* renamed from: f */
    private static final SimpleDateFormat f180181f = new SimpleDateFormat("MM-dd", Locale.getDefault());

    /* renamed from: g */
    private static final SimpleDateFormat f180182g = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

    static {
        Covode.recordClassIndex(93839);
    }

    /* renamed from: a */
    public static int m139649a(long j) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis <= 86400000) {
            return 1;
        }
        if (timeInMillis <= 172800000) {
            return 2;
        }
        if (timeInMillis <= 604800000) {
            return 3;
        }
        if (timeInMillis <= 2592000000L) {
            return 4;
        }
        return 5;
    }

    /* renamed from: a */
    public static int m139650a(Long l) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(l.longValue()));
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(new Date());
        instance2.set(11, 0);
        instance2.set(12, 0);
        instance2.set(13, 0);
        instance2.set(14, 0);
        return (int) ((instance2.getTime().getTime() - instance.getTime().getTime()) / 86400000);
    }

    /* renamed from: b */
    public static String m139652b(Context context, long j) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis < 60000) {
            return context.getString(R.string.cpa);
        }
        if (timeInMillis < 3600000) {
            return context.getString(R.string.gcx, Long.valueOf(timeInMillis / 60000));
        } else if (timeInMillis < 86400000) {
            return context.getString(R.string.gcv, Long.valueOf(timeInMillis / 3600000));
        } else if (timeInMillis < 604800000) {
            return context.getString(R.string.gct, Long.valueOf(timeInMillis / 86400000));
        } else {
            return context.getString(R.string.gd0, Long.valueOf(timeInMillis / 604800000));
        }
    }

    /* renamed from: a */
    public static String m139651a(Context context, long j) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis < 60000) {
            long j2 = timeInMillis / 1000;
            Object[] objArr = new Object[1];
            if (j2 <= 0) {
                j2 = 1;
            }
            objArr[0] = Long.valueOf(j2);
            return context.getString(R.string.fbs, objArr);
        } else if (timeInMillis < 3600000) {
            return context.getString(R.string.gcx, Long.valueOf(timeInMillis / 60000));
        } else if (timeInMillis < 86400000) {
            return context.getString(R.string.gcv, Long.valueOf(timeInMillis / 3600000));
        } else if (timeInMillis < 604800000) {
            return context.getString(R.string.gct, Long.valueOf(timeInMillis / 86400000));
        } else {
            long j3 = timeInMillis - 604800000;
            if (j3 <= 0 || j3 > 86400000) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(j);
                Calendar instance2 = Calendar.getInstance();
                instance2.set(6, 0);
                instance2.set(11, 0);
                instance2.set(12, 0);
                instance2.set(13, 0);
                if (j >= instance2.getTimeInMillis() + 86400000) {
                    return f180178c.format(instance.getTime());
                }
                return f180177b.format(instance.getTime());
            }
            return context.getString(R.string.gd0, 1);
        }
    }

    /* renamed from: c */
    public static String m139653c(Context context, long j) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis < 60000) {
            long j2 = timeInMillis / 1000;
            Object[] objArr = new Object[1];
            if (j2 <= 0) {
                j2 = 1;
            }
            objArr[0] = Long.valueOf(j2);
            return context.getString(R.string.fbs, objArr);
        } else if (timeInMillis < 3600000) {
            return context.getString(R.string.gcx, Long.valueOf(timeInMillis / 60000));
        } else if (timeInMillis < 86400000) {
            return context.getString(R.string.gcv, Long.valueOf(timeInMillis / 3600000));
        } else if (timeInMillis < 604800000) {
            return context.getString(R.string.gct, Long.valueOf(timeInMillis / 86400000));
        } else {
            long j3 = timeInMillis - 604800000;
            if (j3 <= 0 || j3 > 86400000) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(j);
                Calendar instance2 = Calendar.getInstance();
                instance2.set(6, 0);
                instance2.set(11, 0);
                instance2.set(12, 0);
                instance2.set(13, 0);
                if (j >= instance2.getTimeInMillis() + 86400000) {
                    return f180178c.format(instance.getTime());
                }
                return f180177b.format(instance.getTime());
            }
            return context.getString(R.string.gd0, 1);
        }
    }

    /* renamed from: d */
    public static String m139654d(Context context, long j) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis <= 0) {
            return "";
        }
        if (timeInMillis < 60000) {
            long j2 = timeInMillis / 1000;
            Object[] objArr = new Object[1];
            if (j2 == 0) {
                j2 = 1;
            }
            objArr[0] = Long.valueOf(j2);
            return context.getString(R.string.gcz, objArr);
        } else if (timeInMillis < 3600000) {
            return context.getString(R.string.gcy, Long.valueOf(timeInMillis / 60000));
        } else if (timeInMillis < 86400000) {
            return context.getString(R.string.gcw, Long.valueOf(timeInMillis / 3600000));
        } else if (timeInMillis < 604800000) {
            return context.getString(R.string.gcu, Long.valueOf(timeInMillis / 86400000));
        } else {
            long j3 = timeInMillis - 604800000;
            if (j3 <= 0 || j3 > 86400000) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(j);
                Calendar instance2 = Calendar.getInstance();
                instance2.set(6, 0);
                instance2.set(11, 0);
                instance2.set(12, 0);
                instance2.set(13, 0);
                if (j >= instance2.getTimeInMillis() + 86400000) {
                    return f180178c.format(instance.getTime());
                }
                return f180177b.format(instance.getTime());
            }
            return context.getString(R.string.gd1, 1);
        }
    }

    /* renamed from: e */
    public static String m139655e(Context context, long j) {
        Calendar instance = Calendar.getInstance();
        long timeInMillis = instance.getTimeInMillis() - j;
        if (timeInMillis <= 0) {
            return "";
        }
        if (timeInMillis < 60000) {
            long j2 = timeInMillis / 1000;
            Object[] objArr = new Object[1];
            if (j2 == 0) {
                j2 = 1;
            }
            objArr[0] = Long.valueOf(j2);
            return context.getString(R.string.fgi, objArr);
        } else if (timeInMillis < 3600000) {
            return context.getString(R.string.fgh, Long.valueOf(timeInMillis / 60000));
        } else if (timeInMillis < 86400000) {
            return context.getString(R.string.fgg, Long.valueOf(timeInMillis / 3600000));
        } else if (timeInMillis < 604800000) {
            return context.getString(R.string.fgf, Long.valueOf(timeInMillis / 86400000));
        } else {
            long j3 = timeInMillis - 604800000;
            if (j3 <= 0 || j3 > 86400000) {
                Calendar calendar = (Calendar) instance.clone();
                calendar.setTimeInMillis(j);
                Calendar calendar2 = (Calendar) instance.clone();
                calendar2.set(6, 0);
                calendar2.set(11, 0);
                calendar2.set(12, 0);
                calendar2.set(13, 0);
                if (j >= calendar2.getTimeInMillis() + 86400000) {
                    return context.getString(R.string.fgd, f180180e.format(calendar.getTime()));
                }
                return context.getString(R.string.fgd, f180179d.format(calendar.getTime()));
            }
            return context.getString(R.string.fgj, 1);
        }
    }

    /* renamed from: f */
    public static String m139656f(Context context, long j) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis <= 0) {
            return "";
        }
        if (timeInMillis < 60000) {
            long j2 = timeInMillis / 1000;
            Object[] objArr = new Object[1];
            if (j2 == 0) {
                j2 = 1;
            }
            objArr[0] = Long.valueOf(j2);
            return context.getString(R.string.gcz, objArr);
        } else if (timeInMillis < 3600000) {
            return context.getString(R.string.gcy, Long.valueOf(timeInMillis / 60000));
        } else if (timeInMillis < 86400000) {
            return context.getString(R.string.gcw, Long.valueOf(timeInMillis / 3600000));
        } else if (timeInMillis < 604800000) {
            return context.getString(R.string.gcu, Long.valueOf(timeInMillis / 86400000));
        } else {
            long j3 = timeInMillis - 604800000;
            if (j3 <= 0 || j3 > 86400000) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(j);
                Calendar instance2 = Calendar.getInstance();
                instance2.set(6, 0);
                instance2.set(11, 0);
                instance2.set(12, 0);
                instance2.set(13, 0);
                if (j >= instance2.getTimeInMillis() + 86400000) {
                    return f180180e.format(instance.getTime());
                }
                return f180179d.format(instance.getTime());
            }
            return context.getString(R.string.gd1, 1);
        }
    }
}
