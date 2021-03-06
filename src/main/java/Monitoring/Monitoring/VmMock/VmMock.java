package Monitoring.Monitoring.VmMock;

import Monitoring.Monitoring.dto.api.viewmodels.enums.*;
import Monitoring.Monitoring.dto.api.viewmodels.response.*;
import Monitoring.Monitoring.dto.api.viewmodels.submodels.VmHistoryRecord;
import Monitoring.Monitoring.dto.api.viewmodels.submodels.VmManager;
import Monitoring.Monitoring.dto.api.viewmodels.submodels.VmWorker;

import java.time.*;

public class VmMock {
    public static VmPlanSectionsResponse[] vmPlanSectionsResponse =
            new VmPlanSectionsResponse[]
    {
        new VmPlanSectionsResponse("1", "Экстренные", 1), new VmPlanSectionsResponse("2", "Плановые", 5)
    };

    public static VmPlanResponse[] vmPlanResponse =
            new VmPlanResponse[]
    {
        new VmPlanResponse("1", "Изменение IM-283501", "Согласование", BlPlanStatusType.warning, "Описание", new String[]{"Платежи", "Переводы"}, ZonedDateTime.of(2020, 7, 2, 0, 0, 0, 0, ZoneId.of("UTC"))),
        new VmPlanResponse("2", "Изменение IM-283501", "Выполнено", BlPlanStatusType.normal, "Описание", new String[]{ "Платежи" }, ZonedDateTime.of(2016, 6, 5, 0, 0, 0, 0, ZoneId.of("UTC")))
    };

    public static VmPlanWorkersResponse vmPlanWorkersResponse =
            new VmPlanWorkersResponse(
              new VmManager("Иванов К.А.", "https://www.nj.com/resizer/h8MrN0-Nw5dB5FOmMVGMmfVKFJo=/450x0/smart/cloudfront-us-east-1.images.arcpublishing.com/advancelocal/SJGKVE5UNVESVCW7BBOHKQCZVE.jpg", "Начальник управления УАБД ДРИ"),
              new VmWorker[]{
                      new VmWorker("Соколов А. А.", BlWorkerStatus.joined, "Департамент развития инфрастуктуры"),
                      new VmWorker("Иванов А. А.", BlWorkerStatus.pending, "Департамент развития инфрастуктуры"),
                      new VmWorker("Сидоров А. А.", BlWorkerStatus.ready, "Департамент развития инфрастуктуры")
              }
            );

    public static VmPlanInfoResponse vmPlanInfoResponse =
            new VmPlanInfoResponse("10", "Изменение IM-283501", "Согласование", BlPlanStatus.warning, "" +
                    "Описание", "Описание последствий", "Не влияет", "М-Банк", new String[] { "Платежи", "Переводы" },
                    ZonedDateTime.of(2016, 5, 5, 0, 0, 0, 0, ZoneId.of("UTC")),
                    ZonedDateTime.of(2017, 9, 14, 0, 0, 0, 0, ZoneId.of("UTC")),
                    ZonedDateTime.of(2017, 11, 10, 0, 0, 0, 0, ZoneId.of("UTC")),
                    ZonedDateTime.of(2018, 11, 10, 0, 0, 0, 0, ZoneId.of("UTC"))
            );

    public static VmPlanHistoryResponse vmPlanHistoryResponse =
            new VmPlanHistoryResponse(
                    new VmHistoryRecord[] { new VmHistoryRecord("Соколов А. А.", ZonedDateTime.of(2020, 8, 2, 0, 0, 0, 0, ZoneId.of("UTC")),"Роль","Описание работы")},
                    new VmHistoryRecord[] { new VmHistoryRecord("Иванов И. И.", ZonedDateTime.of(2016, 5, 5, 0, 0, 0, 0, ZoneId.of("UTC")),"Другая роль","Описание другой работы")}
            );

    public static VmPlanDescriptionResponse[] vmPlanDescriptionResponse =
            new VmPlanDescriptionResponse[]{
                    new VmPlanDescriptionResponse("Для сотрудников","Выявлена недоступность АБС М-Банк, инстанс main. Последствия — в ВТБ Онлайн профиль клиентов, имеющих продукты экс-БМ собираются из кэш. Во время сбоя в ВТБ-онлайн было невозможно проведение операций по части ранее выпущенных карт (только бывшего Банка Москвы)."),
                    new VmPlanDescriptionResponse("Для СМИ", "Ранее зафиксированные проблемы в ВТБ-Онлайн полностью устранены, работа мобильного приложения восстановлена.\nРанее в системе наблюдался кратковременный технический сбой, в ходе которого в адрес клиентов произошла выгрузка ошибочных СМС о ранее проведённых архивных транзакциях, однако никаких списаний денежных средств не производилось.\nПриносим свои извинения за неудобства, наши IT специалисты делают все возможное для усовершенствования онлайн-сервисов.")
    };

    public static VmAccidentResponse[] vmAccidentResponse =
            new VmAccidentResponse[]
                    {
                            new VmAccidentResponse(
                                    "1",
                                    "Авария IM-216836",
                                    10,
                                    "Описание",
                                    new String[] { "Платежи","Переводы" },
                                    ZonedDateTime.of(2016, 6, 10, 0, 0, 0, 0, ZoneId.of("UTC")),
                                    "Устранение последствий",
                                    BlAccidentStatusType.warning)
                    };

    public static VmNewAccidentResponse vmNewAccidentResponse =
            new VmNewAccidentResponse("1", "Авария IM-216836");

    public static VmAccidentInfoResponse vmAccidentInfoResponse =
            new VmAccidentInfoResponse(
                    "1",
                    "Авария IM-216836",
                    10,
                    "Устранение последствий",
                    BlAccidentStatusType.warning,
                    "Описание",
                    "Описание последствия",
                    "М-Банк",
                    "М-Банк",
                    new String[] { "Платежи", "Переводы" },
                    ZonedDateTime.of(2016, 6, 26, 0, 0, 0, 0, ZoneId.of("UTC")),
                    ZonedDateTime.of(2016, 6, 20, 0, 0, 0, 0, ZoneId.of("UTC")),
                    ZonedDateTime.of(2016, 6, 21, 0, 0, 0, 0, ZoneId.of("UTC")),
                    "https://bankvtb.webex.com/meet/xxx",
                    "https://t.me/vtb"
            );

    public static VmAccidentWorkersResponse vmAccidentWorkersResponse =
            new VmAccidentWorkersResponse(
                    new VmManager("Иванов К.А.", "https://www.nj.com/resizer/h8MrN0-Nw5dB5FOmMVGMmfVKFJo=/450x0/smart/cloudfront-us-east-1.images.arcpublishing.com/advancelocal/SJGKVE5UNVESVCW7BBOHKQCZVE.jpg", "Начальник управления УАБД ДРИ"),
                    new VmWorker[]{
                            new VmWorker("Соколов А. А.", BlWorkerStatus.joined, "Департамент развития инфрастуктуры"),
                            new VmWorker("Иванов А. А.", BlWorkerStatus.pending, "Департамент развития инфрастуктуры"),
                            new VmWorker("Сидоров А. А.", BlWorkerStatus.ready, "Департамент развития инфрастуктуры")
                    }
            );

    public static VmAccidentHistoryResponse vmAccidentHistoryResponse =
            new VmAccidentHistoryResponse(
                    new VmHistoryRecord[] { new VmHistoryRecord("Соколов А. А.", ZonedDateTime.of(2020, 7, 2, 0, 0, 0, 0, ZoneId.of("UTC")),"Роль","Описание работы")},
                    new VmHistoryRecord[] { new VmHistoryRecord("Иванов И. И.", ZonedDateTime.of(2020, 7, 2, 0, 0, 0, 0, ZoneId.of("UTC")),"Другая роль","Описание другой работы")}
            );

    public static VmAccidentDescriptionResponse[] vmAccidentDescriptionResponse =
            new VmAccidentDescriptionResponse[]{
                    new VmAccidentDescriptionResponse("Для сотрудников","Выявлена недоступность АБС М-Банк, инстанс main. Последствия — в ВТБ Онлайн профиль клиентов, имеющих продукты экс-БМ собираются из кэш. Во время сбоя в ВТБ-онлайн было невозможно проведение операций по части ранее выпущенных карт (только бывшего Банка Москвы)."),
                    new VmAccidentDescriptionResponse("Для СМИ", "Ранее зафиксированные проблемы в ВТБ-Онлайн полностью устранены, работа мобильного приложения восстановлена.\nРанее в системе наблюдался кратковременный технический сбой, в ходе которого в адрес клиентов произошла выгрузка ошибочных СМС о ранее проведённых архивных транзакциях, однако никаких списаний денежных средств не производилось.\nПриносим свои извинения за неудобства, наши IT специалисты делают все возможное для усовершенствования онлайн-сервисов.")
            };

    public static VmEventResponse[] vmEventResponse =
            new VmEventResponse[]
                    {
                            new VmEventResponse("1", ZonedDateTime.of(2020, 04, 20, 0,0,0,0, ZoneId.of("UTC")), BlWorkType.accident),
                            new VmEventResponse("2", ZonedDateTime.of(2020, 04, 20, 0,0,0,0, ZoneId.of("UTC")), BlWorkType.plan)
                    };

    public static String[] failurePoints = new String[]
            {
                    "Profile", // Название точки сбоя
                    "УСБС – бэк",
                    "Сервисы Мультикарта",
                    "Каналы связи",
                    "Golden Gate",
                    "Service Manager"
            };

    public static VmMetricsResponse[] vmMetricsResponse = new
            VmMetricsResponse[]
    {
            new VmMetricsResponse("1", "Клиентов в ВТБ Онлайн", true, "65024", -56, -0.6, BlMetricsStatus.warning, 0.5),
            new VmMetricsResponse("2", "Очередь на исполнение документов БО", true, "0", -5, -0.3, BlMetricsStatus.normal, 0.15),
            new VmMetricsResponse("3", "Количество новых операций в ВТБ-онлайн", true, "0", 2, -0.1, BlMetricsStatus.normal, 0.7),
    };

    public static VmUpdateResponse  updateMetricsOrSystem = new VmUpdateResponse("true");

    public static VmMetricInfoResponse[] vmMetricInfoResponse =
            new VmMetricInfoResponse[]
        {
            new VmMetricInfoResponse(65056, 0, 0, BlMetricsStatus.normal, ZonedDateTime.of(2020, 5, 20, 0, 0, 0, 0, ZoneId.of("UTC"))),
            new VmMetricInfoResponse(65000, -56, -0.6, BlMetricsStatus.warning, ZonedDateTime.of(2020, 5, 20, 0, 0, 0, 0, ZoneId.of("UTC")))
        };

    public static VmSystemResponse[] vmSystemResponse =
            new VmSystemResponse[]
                {
                        new VmSystemResponse("1", "Бизнес операции", true, 1, 3, 10),
                        new VmSystemResponse("2", "Другие бизнес-опреации", false, 2, 3, 11)
                };

    public static String[] affectedSystems = new String[]
    {
        "Платежи", // Название затронутой системы
        "Переводы",
        "Интернет банк",
        "Мобильный банк",
        "Вклады"
    };
}
