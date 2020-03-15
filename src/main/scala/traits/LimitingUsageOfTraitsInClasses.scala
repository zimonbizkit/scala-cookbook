package traits

object LimitingUsageOfTraitsInClasses {

}
abstract class Employee                      // no behaviour, just for the sake of naming/tagging
class CorporateEmployee extends Employee     // corporate employee : person working for the brand, like a mkt manager
class StoreEmployee extends Employee         // store employee : somebody that works in the franchise or business

trait DeliversFood extends StoreEmployee
trait ApprovesQuotation extends CorporateEmployee

//                                           .------ @Note: to understand a bit more this example, imagine the 'with'
//                                           |       keyword is in fact a 'that' keyword. This way you can asser that
//                                         __|_      a 'DeliveryPerson' is a 'StoreEmployee' _that_ 'DeliversFood'
class DeliveryPerson extends StoreEmployee with DeliversFood

class ChiefFinanceOfficer extends CorporateEmployee with ApprovesQuotation