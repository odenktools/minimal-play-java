package utils;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.format.ISODateTimeFormat;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public final class TimeHelper {

	private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyyMMdd");

	private static final DateTimeFormatter DATE_FORMAT_INDO = DateTimeFormatter.ofPattern("ddMMyyyy");

	/**
	 * 2017-09-14T18:11:35.240+07:00
	 *
	 * @return String 2017-09-14T18:11:35.240+07:00
	 */
	public static String generateIsoTimeStamp() {

		DateTime dt = new DateTime();
		//dt = dt.plus(Period.days(1));
		DateTimeZone jakartaTimeZone = DateTimeZone.forID("Asia/Jakarta");
		org.joda.time.format.DateTimeFormatter fmt = ISODateTimeFormat.dateTime().withZone(jakartaTimeZone);
		return fmt.print(dt);
	}

	public static String timeExpiredGenerator() {

		DateTime dt = new DateTime();
		dt = dt.plus(Period.days(1));
		DateTimeZone jakartaTimeZone = DateTimeZone.forID("Asia/Jakarta");
		org.joda.time.format.DateTimeFormatter fmt = ISODateTimeFormat.dateTime().withZone(jakartaTimeZone);
		return fmt.print(dt);
	}

	public static String localTimeGenerator() {

		return DATE_FORMAT_INDO.format(LocalDateTime.now(ZoneId.of("Asia/Jakarta")));
	}
}
