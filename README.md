شبیه‌ساز دانشگاه

این پروژه یک سیستم مدیریت دانشگاه است که با استفاده از برنامه‌نویسی شی‌گرا (OOP) طراحی شده و شامل کلاس‌های مربوط به دانشجویان، اساتید، دروس و کارنامه‌ها می‌باشد. هدف این پروژه، شبیه‌سازی ساختار یک دانشگاه ساده و مدیریت اطلاعات مربوط به آن است.

ویژگی‌های پروژه:

1. مدیریت افراد (Person Management)
 • کلاس Person شامل اطلاعات کلی افراد (نام و کد ملی) است.
 • Student و Professor از این کلاس استفاده می‌کنند و شناسه‌ی یکتا دارند.

2. مدیریت دانشجویان (Student Management)
 • هر دانشجو یک ID یکتا دارد.
 • دانشجو به یک رشته (Major) متصل است.
 • دانشجویان دروس مختلف را انتخاب کرده و نمره دریافت می‌کنند.
 • Student شامل متدی برای تولید شماره دانشجویی (setStudentCode) است.

3. مدیریت اساتید (Professor Management)
 • هر استاد به یک رشته تعلق دارد و می‌تواند دروس ارائه دهد.
 • اطلاعات اساتید در Professor ذخیره می‌شود.

4. مدیریت رشته‌ها (Major Management)
 • رشته‌ها در کلاس Major تعریف شده‌اند.
 • هر رشته ظرفیت مشخصی برای پذیرش دانشجو دارد.

5. مدیریت دروس (Course Management)
 • کلاس Course شامل نام درس و تعداد واحدهای آن است.
 • کلاس PresentedCourse مشخص می‌کند که یک درس توسط چه استادی ارائه شده و ظرفیت آن چقدر است.
 • هر PresentedCourse شامل لیستی از دانشجویان ثبت‌نام‌شده است.

6. سیستم کارنامه (Transcript System)
 • هر دانشجو کارنامه‌ای (Transcript) دارد که شامل لیستی از دروس گذرانده‌شده و نمرات آن‌هاست.
 • معدل (GPA) دانشجو بر اساس نمرات ثبت‌شده محاسبه می‌شود.

جزئیات پیاده‌سازی:

۱. ذخیره‌سازی داده‌ها با ArrayList
 • از ArrayList برای ذخیره‌ی دانشجویان، اساتید، دروس و کارنامه‌ها استفاده شده است.

۲. جستجوی داده‌ها با findById
 • در تمام کلاس‌های اصلی متد findById پیاده‌سازی شده است که امکان جستجو بر اساس ID را فراهم می‌کند.

۳. مدیریت ثبت‌نام و ظرفیت دروس
 • در کلاس PresentedCourse، قبل از افزودن دانشجو، ظرفیت درس بررسی می‌شود.

۴. محاسبه و نمایش کارنامه‌ی دانشجو
 • اطلاعات دروس گذرانده‌شده همراه با نمرات آن‌ها در کارنامه ذخیره می‌شود.
 • معدل دانشجو با متد getGPA محاسبه می‌شود.

مراحل اجرای برنامه:
 1. ایجاد چند دانشجو و استاد.
 2. تعریف چند رشته و اختصاص آن‌ها به دانشجویان و اساتید.
 3. ایجاد و ارائه‌ی چند درس توسط اساتید.
 4. ثبت‌نام دانشجویان در دروس ارائه‌شده.
 5. اختصاص نمره به دانشجویان و محاسبه‌ی معدل آن‌ها.
 6. نمایش اطلاعات دانشجویان، اساتید، دروس و کارنامه‌ها.

نکات مهم:
 • از findById برای یافتن اشیا در لیست‌ها استفاده شده است.
 • برای جلوگیری از ثبت‌نام بیش از حد، ظرفیت دروس کنترل می‌شود.
 • هنگام تنظیم نمره، بررسی می‌شود که آیا دانشجو در آن درس ثبت‌نام کرده یا نه.
 • شماره‌ی دانشجویی بر اساس سال ورود و ترتیب ثبت‌نام تولید می‌شود.

فایل Main.java
 • این فایل شامل اجرای برنامه و تست بخش‌های مختلف پروژه است.
 • در main چندین دانشجو، استاد و درس ایجاد شده و سناریوهای مختلف بررسی می‌شود.

این پروژه یک پیاده‌سازی ساده اما کارآمد از سیستم مدیریت دانشگاه است که اصول برنامه‌نویسی شی‌گرا را رعایت می‌کند.



