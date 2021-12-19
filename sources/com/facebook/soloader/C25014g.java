package com.facebook.soloader;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* renamed from: com.facebook.soloader.g */
public final class C25014g {
    static {
        Covode.recordClassIndex(30346);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.soloader.g$a */
    public static class C25015a extends RuntimeException {
        static {
            Covode.recordClassIndex(30347);
        }

        C25015a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static String[] m47959a(File file) {
        MethodCollector.m26663i(7208);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return m47960a(fileInputStream.getChannel());
        } finally {
            fileInputStream.close();
            MethodCollector.m26664o(7208);
        }
    }

    /* renamed from: a */
    private static String[] m47960a(FileChannel fileChannel) {
        long j;
        long c;
        int c2;
        long a;
        long a2;
        long j2;
        long a3;
        long a4;
        long a5;
        long a6;
        long j3;
        long a7;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (m47961b(fileChannel, allocate, 0) == 1179403647) {
            boolean z = true;
            if (m47963d(fileChannel, allocate, 4) != 1) {
                z = false;
            }
            if (m47963d(fileChannel, allocate, 5) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z) {
                j = m47961b(fileChannel, allocate, 28);
                if (z) {
                    c = (long) m47962c(fileChannel, allocate, 44);
                    c2 = m47962c(fileChannel, allocate, 42);
                }
                c = (long) m47962c(fileChannel, allocate, 56);
                c2 = m47962c(fileChannel, allocate, 54);
            } else {
                j = m47957a(fileChannel, allocate, 32);
                c = (long) m47962c(fileChannel, allocate, 56);
                c2 = m47962c(fileChannel, allocate, 54);
            }
            if (c == 65535) {
                if (z) {
                    c = m47961b(fileChannel, allocate, m47961b(fileChannel, allocate, 32) + 28);
                } else {
                    c = m47961b(fileChannel, allocate, m47957a(fileChannel, allocate, 40) + 44);
                }
            }
            long j4 = j;
            long j5 = 0;
            while (true) {
                if (j5 >= c) {
                    break;
                } else if (m47961b(fileChannel, allocate, j4 + 0) == 2) {
                    if (z) {
                        a = m47961b(fileChannel, allocate, j4 + 4);
                    } else {
                        a = m47957a(fileChannel, allocate, j4 + 8);
                    }
                    long j6 = 0;
                    if (a != 0) {
                        long j7 = a;
                        long j8 = 0;
                        int i = 0;
                        while (true) {
                            if (z) {
                                a2 = m47961b(fileChannel, allocate, j7 + j6);
                            } else {
                                z = false;
                                a2 = m47957a(fileChannel, allocate, j7 + j6);
                            }
                            if (a2 == 1) {
                                if (i != Integer.MAX_VALUE) {
                                    i++;
                                } else {
                                    throw new C25015a("malformed DT_NEEDED section");
                                }
                            } else if (a2 == 5) {
                                if (z) {
                                    j8 = m47961b(fileChannel, allocate, j7 + 4);
                                } else {
                                    j8 = m47957a(fileChannel, allocate, j7 + 8);
                                }
                            }
                            long j9 = 16;
                            if (z) {
                                j2 = 8;
                            } else {
                                j2 = 16;
                            }
                            j7 += j2;
                            j6 = 0;
                            if (a2 == 0) {
                                if (j8 != 0) {
                                    int i2 = 0;
                                    while (true) {
                                        if (((long) i2) >= c) {
                                            break;
                                        }
                                        if (m47961b(fileChannel, allocate, j + j6) == 1) {
                                            if (z) {
                                                a3 = m47961b(fileChannel, allocate, j + 8);
                                                a4 = m47961b(fileChannel, allocate, j + 20);
                                            } else {
                                                a3 = m47957a(fileChannel, allocate, j + j9);
                                                a4 = m47957a(fileChannel, allocate, j + 40);
                                            }
                                            if (a3 <= j8 && j8 < a4 + a3) {
                                                if (z) {
                                                    a5 = m47961b(fileChannel, allocate, j + 4);
                                                } else {
                                                    a5 = m47957a(fileChannel, allocate, j + 8);
                                                }
                                                long j10 = a5 + (j8 - a3);
                                                long j11 = 0;
                                                if (j10 != 0) {
                                                    String[] strArr = new String[i];
                                                    int i3 = 0;
                                                    while (true) {
                                                        if (z) {
                                                            a6 = m47961b(fileChannel, allocate, a + j11);
                                                        } else {
                                                            a6 = m47957a(fileChannel, allocate, a + j11);
                                                        }
                                                        if (a6 == 1) {
                                                            if (z) {
                                                                a7 = m47961b(fileChannel, allocate, a + 4);
                                                            } else {
                                                                a7 = m47957a(fileChannel, allocate, a + 8);
                                                            }
                                                            long j12 = a7 + j10;
                                                            StringBuilder sb = new StringBuilder();
                                                            while (true) {
                                                                long j13 = j12 + 1;
                                                                short d = m47963d(fileChannel, allocate, j12);
                                                                if (d == 0) {
                                                                    break;
                                                                }
                                                                sb.append((char) d);
                                                                j12 = j13;
                                                            }
                                                            strArr[i3] = sb.toString();
                                                            if (i3 != Integer.MAX_VALUE) {
                                                                i3++;
                                                            } else {
                                                                throw new C25015a("malformed DT_NEEDED section");
                                                            }
                                                        }
                                                        if (z) {
                                                            j3 = 8;
                                                        } else {
                                                            j3 = 16;
                                                        }
                                                        a += j3;
                                                        if (a6 != 0) {
                                                            j11 = 0;
                                                        } else if (i3 == i) {
                                                            return strArr;
                                                        } else {
                                                            throw new C25015a("malformed DT_NEEDED section");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        j += (long) c2;
                                        i2++;
                                        j9 = 16;
                                        j6 = 0;
                                    }
                                    throw new C25015a("did not find file offset of DT_STRTAB table");
                                }
                                throw new C25015a("Dynamic section string-table not found");
                            }
                        }
                    }
                } else {
                    j4 += (long) c2;
                    j5++;
                }
            }
            throw new C25015a("ELF file does not contain dynamic linking information");
        }
        throw new C25015a("file is not ELF");
    }

    /* renamed from: a */
    private static long m47957a(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        m47958a(fileChannel, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    /* renamed from: b */
    private static long m47961b(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        m47958a(fileChannel, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    /* renamed from: c */
    private static int m47962c(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        m47958a(fileChannel, byteBuffer, 2, j);
        return byteBuffer.getShort() & 65535;
    }

    /* renamed from: d */
    private static short m47963d(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        m47958a(fileChannel, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }

    /* renamed from: a */
    private static void m47958a(FileChannel fileChannel, ByteBuffer byteBuffer, int i, long j) {
        int read;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (read = fileChannel.read(byteBuffer, j)) != -1) {
            j += (long) read;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new C25015a("ELF file truncated");
    }
}
